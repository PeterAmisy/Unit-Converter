package com.peter.amisy.unit_converter.services;

import org.springframework.stereotype.Service;

@Service
public class TemperatureConverter {
    public double convertTemperature(double value, String from, String to) {
        double result = 0;
        if (from.equals("C") && to.equals("F")) {
            result = (value * 9 / 5) + 32;
        } else if (from.equals("F") && to.equals("C")) {
            result = (value - 32) * 5 / 9;
        } else if (from.equals("C") && to.equals("K")) {
            result = value + 273.15;
        } else if (from.equals("K") && to.equals("C")) {
            result = value - 273.15;
        } else if (from.equals("F") && to.equals("K")) {
            result = (value - 32) * 5 / 9 + 273.15;
        } else if (from.equals("K") && to.equals("F")) {
            result = (value - 273.15) * 9 / 5 + 32;
        } else {
            result = value;
        }
        return result;
    }
}
