package com.nttdata.temperaturalibrary;

import java.util.Objects;

public class Temperatura {

    private String unitName;

    public Temperatura (String unitName) {
        this.unitName = unitName;
    }

    public Double selectUnit(Double temp) {
        double cuantity = 0;

        if (Objects.equals(unitName, "fahrenheit")) {
            /*cuantity = (temp -32) / 1.8;*/
            cuantity = (temp - 32) / 1.8D;
        }else{
            /*cuantity = (temp * 1.8) + 32;*/
            cuantity = (temp * 1.8D) + 32;

        }
        return cuantity;

    }

}
