package com.nttdata.temperaturaautoconfigure.temperatura;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("temperatura")
@Getter
@Setter
public class TemperaturaProperties {

        private String unit = "celsius";

    }
