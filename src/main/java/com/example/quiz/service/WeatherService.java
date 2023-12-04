package com.example.quiz.service;

import com.example.quiz.dto.WeatherData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;


@Service
public class WeatherService {

    private static final Logger log = LoggerFactory.getLogger(WeatherService.class);

    private final WebClient webClient;

    public WeatherService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.open-meteo.com/v1")
                .build();
    }

    public Mono<WeatherData> fetchWeatherData(double latitude, double longitude) {
        return webClient.get()
                .uri("/forecast?latitude={latitude}&longitude={longitude}&current=apparent_temperature,is_day,precipitation,rain,showers,snowfall,weather_code,cloud_cover,pressure_msl,surface_pressure",
                        latitude, longitude)
                .retrieve()
                .bodyToMono(WeatherData.class)
                .timeout(Duration.ofSeconds(10))
                .doOnError(error -> {
                    // Handle errors and return a fallback or provide a meaningful error message
                    log.error("Error fetching weather data: " + error.getMessage(), error);
                })
                .retry(3); // Retry up to 3 times in case of transient failures
    }
}
