package com.nttdata.temperaturastarter.controller;

import com.nttdata.temperaturalibrary.Temperatura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperaturaController {

    @Autowired
    private Temperatura temperatura;

    @GetMapping("/conversion/{cuantity}")
    public ResponseEntity<?> calculateTemperature(@PathVariable("cuantity") Double cuantity) {
        Double result = temperatura.selectUnit(temperatura.selectUnit(cuantity));
        return new ResponseEntity<>("resultado: " +result,HttpStatus.OK );
    }

}
