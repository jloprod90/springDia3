package com.nttdata.temperaturaautoconfigure.temperatura;

import com.nttdata.temperaturalibrary.Temperatura;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Temperatura.class)
@EnableConfigurationProperties(TemperaturaProperties.class)
public class TemperaturaAutoconfigure {

    private final TemperaturaProperties properties;

    public TemperaturaAutoconfigure(TemperaturaProperties properties) {
        this.properties = properties;
    }

    @Bean
    public Temperatura temperatura() {
        return new Temperatura(properties.getUnit());
    }

}
