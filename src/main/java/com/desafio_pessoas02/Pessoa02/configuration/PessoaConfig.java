package com.desafio_pessoas02.Pessoa02.configuration;

import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.LogGatway;
import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.PessoaGateway;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.implementacoes.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PessoaConfig {

    @Bean
    public CriarPessoaUseCaseImpl criarPessoaUseCase(PessoaGateway pessoaGateway, LogGatway logGatway) {
        return new CriarPessoaUseCaseImpl(pessoaGateway,logGatway);
    }

    @Bean
    public AtualizarPessoaUseCaseImpl AtualizarPessoaUseCase(PessoaGateway pessoaGateway, LogGatway logGatway) {
        return new AtualizarPessoaUseCaseImpl(pessoaGateway,logGatway);
    }

    @Bean
    public ListarPessoasUseCaseImpl listarPessoasUseCase(PessoaGateway pessoaGateway, LogGatway logGatway){
        return new ListarPessoasUseCaseImpl(pessoaGateway, logGatway);
    }

    @Bean
    public DeletarPessoaUseCaseImpl deletarPessoaUseCase(PessoaGateway pessoaGateway, LogGatway logGatway){
        return new DeletarPessoaUseCaseImpl(pessoaGateway, logGatway);
    }

    @Bean
    public BuscarPessoaUseCaseImpl buscarPessoaUseCase(PessoaGateway pessoaGateway, LogGatway logGatway){
        return new BuscarPessoaUseCaseImpl(pessoaGateway,logGatway);
    }
}