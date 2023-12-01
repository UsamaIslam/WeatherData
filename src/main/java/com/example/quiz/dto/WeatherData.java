package com.example.quiz.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherData {

    @JsonProperty("latitude")
    private double latitude;

    @JsonProperty("longitude")
    private double longitude;

    @JsonProperty("generationtime_ms")
    private double generationTimeMs;

    @JsonProperty("utc_offset_seconds")
    private int utcOffsetSeconds;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("timezone_abbreviation")
    private String timezoneAbbreviation;

    @JsonProperty("elevation")
    private double elevation;

    @JsonProperty("current_units")
    private Units currentUnits;

    @JsonProperty("current")
    private CurrentWeather currentWeather;

    // Getters and setters

    @Data
    public static class Units {
        @JsonProperty("time")
        private String time;

        @JsonProperty("interval")
        private String interval;

        @JsonProperty("apparent_temperature")
        private String apparentTemperature;

        @JsonProperty("is_day")
        private String isDay;

        @JsonProperty("precipitation")
        private String precipitation;

        @JsonProperty("rain")
        private String rain;

        @JsonProperty("showers")
        private String showers;

        @JsonProperty("snowfall")
        private String snowfall;

        @JsonProperty("weather_code")
        private String weatherCode;

        @JsonProperty("cloud_cover")
        private String cloudCover;

        @JsonProperty("pressure_msl")
        private String pressureMsl;

        @JsonProperty("surface_pressure")
        private String surfacePressure;

        // Getters and setters
    }

    @Data
    public static class CurrentWeather {
        @JsonProperty("time")
        private String time;

        @JsonProperty("interval")
        private int interval;

        @JsonProperty("apparent_temperature")
        private double apparentTemperature;

        @JsonProperty("is_day")
        private int isDay;

        @JsonProperty("precipitation")
        private double precipitation;

        @JsonProperty("rain")
        private double rain;

        @JsonProperty("showers")
        private double showers;

        @JsonProperty("snowfall")
        private double snowfall;

        @JsonProperty("weather_code")
        private int weatherCode;

        @JsonProperty("cloud_cover")
        private int cloudCover;

        @JsonProperty("pressure_msl")
        private double pressureMsl;

        @JsonProperty("surface_pressure")
        private double surfacePressure;

        // Getters and setters
    }
}
