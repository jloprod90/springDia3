package com.nttdata.saludoautoconfigure.saludo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("saludo.mensaje")
@Getter
@Setter
public class SaludoProperties {

    private String idioma = "Castellano";

}
