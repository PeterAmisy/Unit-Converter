package com.peter.amisy.unit_converter.controller;

import com.peter.amisy.unit_converter.services.LengthConverter;
import com.peter.amisy.unit_converter.services.TemperatureConverter;
import com.peter.amisy.unit_converter.services.WeightConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {

    @Autowired
    private LengthConverter lengthConverter;

    @Autowired
    private TemperatureConverter temperatureConverter;

    @Autowired
    private WeightConverter weightConverter;

    @GetMapping("/convert")
    public String convert(@RequestParam double value, @RequestParam String from, @RequestParam String to, @RequestParam String type, Model model) {
        double result = 0;
        switch (type) {
            case "Length":
                result = lengthConverter.convertLength(value, from, to);
                break;
            case "Temperature":
                result = temperatureConverter.convertTemperature(value, from, to);
                break;
            case "Weight":
                result = weightConverter.convertWeight(value, from, to);
                break;
        }
        model.addAttribute("result", "Result: " + result);
        return "index";
    }
}