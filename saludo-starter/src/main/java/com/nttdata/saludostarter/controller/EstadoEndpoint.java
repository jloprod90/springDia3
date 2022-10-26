package com.nttdata.saludostarter.controller;

import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Endpoint(id = "estados")
public class EstadoEndpoint {

    private List<String> listado = new ArrayList<>();

    @ReadOperation
    public List<String> estados() {
        return listado;
    }

    @WriteOperation
    public void writteOperation(@Selector String estadoNuevo) {
        listado.add(estadoNuevo);
    }

    @DeleteOperation
    public void deleteOperation(@Selector String estadoDelete) {
        listado.remove(estadoDelete);
    }
}
