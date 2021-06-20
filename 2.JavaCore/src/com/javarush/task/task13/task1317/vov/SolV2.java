package com.javarush.task.task13.task1317.vov;

import com.javarush.task.task13.task1317.Weather;
import com.javarush.task.task13.task1317.WeatherType;

public class SolV2 {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
        System.out.println(new Today(WeatherType.CLOUDY));

    }

    static class Today implements Weather {
        private String type;

        public Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("Сегодня будет %s", this.getWeatherType());
        }

        @Override
        public String getWeatherType() {
            return this.type;
        }
    }
}
