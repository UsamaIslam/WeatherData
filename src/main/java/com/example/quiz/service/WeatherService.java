package com.example.quiz.service;

import com.example.quiz.dto.WeatherData;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WeatherService {

    private final WebClient webClient;

    public WeatherService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.open-meteo.com/v1").build();
    }

    public Mono<WeatherData> fetchWeatherData(double latitude, double longitude) {
        return webClient.get()
                .uri("/forecast?latitude=52.52&longitude=13.41&current=apparent_temperature,is_day,precipitation,rain,showers,snowfall,weather_code,cloud_cover,pressure_msl,surface_pressure",
                        latitude, longitude)
                .retrieve()
                .bodyToMono(WeatherData.class);
    }
}