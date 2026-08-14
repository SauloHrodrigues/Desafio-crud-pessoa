package com.desafio_pessoas02.Pessoa02.configuration;

import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.PessoaGateway;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.CalcularIdadeUseCase;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.implementacoes.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PessoaConfig {

    @Bean
    public CriarPessoaUseCaseImpl criarPessoaUseCase(PessoaGateway pessoaGateway) {
        return new CriarPessoaUseCaseImpl(pessoaGateway);
    }

    @Bean
    public AtualizarPessoaUseCaseImpl AtualizarPessoaUseCase(PessoaGateway pessoaGateway) {
        return new AtualizarPessoaUseCaseImpl(pessoaGateway);
    }

    @Bean
    public ListarPessoasUseCaseImpl listarPessoasUseCase(PessoaGateway pessoaGateway){
        return new ListarPessoasUseCaseImpl(pessoaGateway);
    }

    @Bean
    public DeletarPessoaUseCaseImpl deletarPessoaUseCase(PessoaGateway pessoaGateway){
        return new DeletarPessoaUseCaseImpl(pessoaGateway);
    }

    @Bean
    public BuscarPessoaUseCaseImpl buscarPessoaUseCase(PessoaGateway pessoaGateway){
        return new BuscarPessoaUseCaseImpl(pessoaGateway);
    }

    @Bean
    public CalcularIdadeUseCaseImpl calcularIdadeUseCase(PessoaGateway pessoaGateway){
        return new CalcularIdadeUseCaseImpl(pessoaGateway);
    }

}
