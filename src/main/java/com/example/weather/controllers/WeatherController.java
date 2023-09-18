package com.example.weather.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
public class WeatherController {
    @GetMapping
    public List<Weather> home() {
        return List.of(new Weather("Cotonou", 23), new Weather("Lagos", 20), new Weather("Bamako", 25),
                new Weather("Niamey", 26));
    }
}
