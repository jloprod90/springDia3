package com.nttdata.saludostarter.controller;

import com.nttdata.saludoidioma.Saludo;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    Saludo saludo;

    @GetMapping("/prueba")
    public String pruebaSaludo() {
        return saludo.mensajeSaludo();
    }


    private Counter counter;

    public TestController(MeterRegistry registry) {
        this.counter = Counter.builder("invocaciones.hello").description("Invocaciones totales").register(registry);
    }

    @GetMapping(path = "/helloWorld")
    public String helloWorld() {
        counter.increment();
        return "hello World";
    }
}
