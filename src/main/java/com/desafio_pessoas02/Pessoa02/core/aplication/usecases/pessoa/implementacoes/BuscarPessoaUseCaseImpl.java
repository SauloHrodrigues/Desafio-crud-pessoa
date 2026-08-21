package com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.implementacoes;

import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.LogGatway;
import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.PessoaGateway;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.BuscarPessoaUseCase;
import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import com.desafio_pessoas02.Pessoa02.core.domain.exceptions.PessoaNaoEncontradaException;
import com.desafio_pessoas02.Pessoa02.core.domain.log.Log;


public class BuscarPessoaUseCaseImpl implements BuscarPessoaUseCase {

    private final PessoaGateway pessoaGateway;
    private final LogGatway logGatway;

    public BuscarPessoaUseCaseImpl(PessoaGateway pessoaGateway, LogGatway logGatway) {
        this.pessoaGateway = pessoaGateway;
        this.logGatway = logGatway;
    }

    @Override
    public Pessoa execute(Long id) {
        var pessoa = pessoaGateway.buscarPessoa(id);

        if(pessoa == null){
            throw new PessoaNaoEncontradaException("Não há pessoa cadastrada no nosso banco com id: "+id);
        }

        logGatway.salvar(new Log("Buscar", "Pessoa",
                pessoa.getId(), "buscando a pessoa."));
        return pessoa;
    }
}
