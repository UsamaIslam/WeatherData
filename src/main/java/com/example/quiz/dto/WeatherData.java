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

    // Getters and setters
    @JsonProperty("current")
    private CurrentWeather currentWeather;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getGenerationTimeMs() {
        return generationTimeMs;
    }

    public void setGenerationTimeMs(double generationTimeMs) {
        this.generationTimeMs = generationTimeMs;
    }

    public int getUtcOffsetSeconds() {
        return utcOffsetSeconds;
    }

    public void setUtcOffsetSeconds(int utcOffsetSeconds) {
        this.utcOffsetSeconds = utcOffsetSeconds;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTimezoneAbbreviation() {
        return timezoneAbbreviation;
    }

    public void setTimezoneAbbreviation(String timezoneAbbreviation) {
        this.timezoneAbbreviation = timezoneAbbreviation;
    }

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    public Units getCurrentUnits() {
        return currentUnits;
    }

    public void setCurrentUnits(Units currentUnits) {
        this.currentUnits = currentUnits;
    }

    public CurrentWeather getCurrentWeather() {
        return currentWeather;
    }

    public void setCurrentWeather(CurrentWeather currentWeather) {
        this.currentWeather = currentWeather;
    }

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

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getInterval() {
            return interval;
        }

        public void setInterval(String interval) {
            this.interval = interval;
        }

        public String getApparentTemperature() {
            return apparentTemperature;
        }

        public void setApparentTemperature(String apparentTemperature) {
            this.apparentTemperature = apparentTemperature;
        }

        public String getIsDay() {
            return isDay;
        }

        public void setIsDay(String isDay) {
            this.isDay = isDay;
        }

        public String getPrecipitation() {
            return precipitation;
        }

        public void setPrecipitation(String precipitation) {
            this.precipitation = precipitation;
        }

        public String getRain() {
            return rain;
        }

        public void setRain(String rain) {
            this.rain = rain;
        }

        public String getShowers() {
            return showers;
        }

        public void setShowers(String showers) {
            this.showers = showers;
        }

        public String getSnowfall() {
            return snowfall;
        }

        public void setSnowfall(String snowfall) {
            this.snowfall = snowfall;
        }

        public String getWeatherCode() {
            return weatherCode;
        }

        public void setWeatherCode(String weatherCode) {
            this.weatherCode = weatherCode;
        }

        public String getCloudCover() {
            return cloudCover;
        }

        public void setCloudCover(String cloudCover) {
            this.cloudCover = cloudCover;
        }

        public String getPressureMsl() {
            return pressureMsl;
        }

        public void setPressureMsl(String pressureMsl) {
            this.pressureMsl = pressureMsl;
        }

        public String getSurfacePressure() {
            return surfacePressure;
        }

        public void setSurfacePressure(String surfacePressure) {
            this.surfacePressure = surfacePressure;
        }

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

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public int getInterval() {
            return interval;
        }

        public void setInterval(int interval) {
            this.interval = interval;
        }

        public double getApparentTemperature() {
            return apparentTemperature;
        }

        public void setApparentTemperature(double apparentTemperature) {
            this.apparentTemperature = apparentTemperature;
        }

        public int getIsDay() {
            return isDay;
        }

        public void setIsDay(int isDay) {
            this.isDay = isDay;
        }

        public double getPrecipitation() {
            return precipitation;
        }

        public void setPrecipitation(double precipitation) {
            this.precipitation = precipitation;
        }

        public double getRain() {
            return rain;
        }

        public void setRain(double rain) {
            this.rain = rain;
        }

        public double getShowers() {
            return showers;
        }

        public void setShowers(double showers) {
            this.showers = showers;
        }

        public double getSnowfall() {
            return snowfall;
        }

        public void setSnowfall(double snowfall) {
            this.snowfall = snowfall;
        }

        public int getWeatherCode() {
            return weatherCode;
        }

        public void setWeatherCode(int weatherCode) {
            this.weatherCode = weatherCode;
        }

        public int getCloudCover() {
            return cloudCover;
        }

        public void setCloudCover(int cloudCover) {
            this.cloudCover = cloudCover;
        }

        public double getPressureMsl() {
            return pressureMsl;
        }

        public void setPressureMsl(double pressureMsl) {
            this.pressureMsl = pressureMsl;
        }

        public double getSurfacePressure() {
            return surfacePressure;
        }

        public void setSurfacePressure(double surfacePressure) {
            this.surfacePressure = surfacePressure;
        }

        // Getters and setters
    }
}
