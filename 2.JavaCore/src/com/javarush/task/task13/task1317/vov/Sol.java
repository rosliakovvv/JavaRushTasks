package com.javarush.task.task13.task1317.vov;

import com.javarush.task.task13.task1317.Weather;
import com.javarush.task.task13.task1317.WeatherType;

public class Sol {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }

    static class Today implements Weather {
        private String type;

        Today(String type) {
            this.type = type;
        }

        public String getWeatherType() {
            return this.type;
        }

        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }
    }
}
