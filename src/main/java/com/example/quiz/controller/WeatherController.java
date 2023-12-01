package com.example.quiz.controller;

import com.example.quiz.dto.WeatherData;
import com.example.quiz.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public Mono<WeatherData> getWeather() {
        double latitude = 52.52; // Replace with actual latitude
        double longitude = 13.419998; // Replace with actual longitude

        return weatherService.fetchWeatherData(latitude, longitude);
    }
}
