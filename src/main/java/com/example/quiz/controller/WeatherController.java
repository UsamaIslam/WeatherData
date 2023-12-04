package com.example.quiz.controller;

import com.example.quiz.dto.WeatherData;
import com.example.quiz.service.WeatherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private static final Logger log = LoggerFactory.getLogger(WeatherController.class);

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public Mono<WeatherData> getWeather(
            @RequestParam("latitude") double latitude,
            @RequestParam("longitude") double longitude
    ) {
        return weatherService.fetchWeatherData(latitude, longitude)
                .doOnError(error -> {
                    // Handle errors and return a fallback or provide a meaningful error message
                    log.error("Error fetching weather data: {}", error.getMessage(), error);
                });
    }
}
