package com.desafio_pessoas02.Pessoa02.configuration;

import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.EnderecoGateway;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.endercos.implementacoes.AtualizarEnderecosUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnderecoConfig {

    @Bean
    public AtualizarEnderecosUseCaseImpl atualizarEnderecosUseCase(EnderecoGateway enderecoGateway){
        return new AtualizarEnderecosUseCaseImpl(enderecoGateway);
    }
}
