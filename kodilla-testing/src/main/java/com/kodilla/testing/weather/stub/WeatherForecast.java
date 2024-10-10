package com.kodilla.testing.weather.stub;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }

        return resultMap;
    }

    public double calculateAverageTemperature() {

        double avg = 0;

        for (double temperature : temperatures.getTemperatures().values()) {
            avg += temperature;
        }

        return avg / temperatures.getTemperatures().size();

    }

    public double calculateMedianTemperature() {

        List<Double> sorted = temperatures.getTemperatures().values().stream().sorted(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o1.compareTo(o2);
            }
        }).toList();

        if (sorted.size() % 2 == 0) {
            double median1 = sorted.get(sorted.size() / 2 - 1);
            double median2 = sorted.get(sorted.size() / 2);
            return (median1 + median2) / 2;
        } else {
            return sorted.get((sorted.size() / 2));
        }

    }

}