package com.peter.amisy.unit_converter.services;

import org.springframework.stereotype.Service;

@Service
public class WeightConverter {
    public double convertWeight(double value, String from, String to) {
        double result = 0;
        if (from.equals("kg") && to.equals("g")) {
            result = value * 1000;
        } else if (from.equals("g") && to.equals("kg")) {
            result = value / 1000;
        } else if (from.equals("kg") && to.equals("mg")) {
            result = value * 1000000;
        } else if (from.equals("mg") && to.equals("kg")) {
            result = value / 1000000;
        } else if (from.equals("g") && to.equals("mg")) {
            result = value * 1000;
        } else if (from.equals("mg") && to.equals("g")) {
            result = value / 1000;
        } else if (from.equals("t") && to.equals("kg")) {
            result = value * 1000;
        } else if (from.equals("kg") && to.equals("t")) {
            result = value / 1000;
        } else if (from.equals("t") && to.equals("g")) {
            result = value * 1000000;
        } else if (from.equals("g") && to.equals("t")) {
            result = value / 1000000;
        } else if (from.equals("t") && to.equals("mg")) {
            result = value * 1000000000;
        } else if (from.equals("mg") && to.equals("t")) {
            result = value / 1000000000;
        } else {
            result = value;
        }
        return result;
    }
}
