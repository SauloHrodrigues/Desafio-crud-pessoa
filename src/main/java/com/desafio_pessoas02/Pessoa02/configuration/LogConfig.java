package com.desafio_pessoas02.Pessoa02.configuration;

import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.LogGatway;
import com.desafio_pessoas02.Pessoa02.core.aplication.service.LogService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogConfig {

    @Bean
    public LogService logService(LogGatway logGatway){
        return new LogService(logGatway);
    }
}
