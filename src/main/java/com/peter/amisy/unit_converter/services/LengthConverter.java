package com.peter.amisy.unit_converter.services;

import org.springframework.stereotype.Service;

@Service
public class LengthConverter {
    public double convertLength(double value, String from, String to) {
        double result = 0;
        if (from.equals("m") && to.equals("cm")) {
            result = value * 100;
        } else if (from.equals("cm") && to.equals("m")) {
            result = value / 100;
        } else if (from.equals("m") && to.equals("mm")) {
            result = value * 1000;
        } else if (from.equals("mm") && to.equals("m")) {
            result = value / 1000;
        } else if (from.equals("cm") && to.equals("mm")) {
            result = value * 10;
        } else if (from.equals("mm") && to.equals("cm")) {
            result = value / 10;
        } else if (from.equals("km") && to.equals("m")) {
            result = value * 1000;
        } else if (from.equals("m") && to.equals("km")) {
            result = value / 1000;
        } else if (from.equals("km") && to.equals("cm")) {
            result = value * 100000;
        } else if (from.equals("cm") && to.equals("km")) {
            result = value / 100000;
        } else if (from.equals("km") && to.equals("mm")) {
            result = value * 1000000;
        } else if (from.equals("mm") && to.equals("km")) {
            result = value / 1000000;
        } else {
            result = value;
        }
        return result;
    }
}
