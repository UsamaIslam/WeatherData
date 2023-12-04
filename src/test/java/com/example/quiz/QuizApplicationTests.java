package com.example.quiz;

import com.example.quiz.dto.WeatherData;
import com.example.quiz.service.WeatherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureWebTestClient
class QuizApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@MockBean
	private WeatherService weatherService;

	@Test
	void getWeather() {
		double latitude = 52.52;
		double longitude = 13.419998;

		WeatherData mockWeatherData = createMockWeatherData();

		when(weatherService.fetchWeatherData(anyDouble(), anyDouble()))
				.thenReturn(Mono.just(mockWeatherData));

		webTestClient.get()
				.uri("/weather")
				.exchange()
				.expectStatus().isOk()
				.expectHeader().contentType(MediaType.APPLICATION_JSON)
				.expectBody()
				.jsonPath("$.latitude").isEqualTo(latitude)
				.jsonPath("$.longitude").isEqualTo(longitude)
				.jsonPath("$.current.apparent_temperature").isEqualTo(mockWeatherData.getCurrentWeather().getApparentTemperature());
	}

	private WeatherData createMockWeatherData() {
		WeatherData weatherData = new WeatherData();
		weatherData.setLatitude(52.52);
		weatherData.setLongitude(13.419998);

		WeatherData.CurrentWeather currentWeather = new WeatherData.CurrentWeather();
		currentWeather.setApparentTemperature(-10.6);

		weatherData.setCurrentWeather(currentWeather);

		return weatherData;
	}
}
