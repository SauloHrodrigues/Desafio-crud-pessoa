package com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.implementacoes;

import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.PessoaGateway;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.AtualizarPessoaUseCase;

public class AtualizarPessoaUseCaseImpl implements AtualizarPessoaUseCase {
    private final PessoaGateway pessoaGateway;

    public AtualizarPessoaUseCaseImpl(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }

    @Override
    public Pessoa execute(Pessoa pessoa) {
        Pessoa existente = pessoaGateway.buscarPessoa(pessoa.getId());

        if(existente == null){
            throw new RuntimeException("Pessoa não encontrada");
        }

        return pessoaGateway.atualizarPessoa(existente,pessoa);
    }
}
