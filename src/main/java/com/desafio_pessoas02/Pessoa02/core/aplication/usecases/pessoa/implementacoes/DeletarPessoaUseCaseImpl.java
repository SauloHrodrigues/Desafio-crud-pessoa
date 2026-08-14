package com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.implementacoes;

import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.PessoaGateway;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.DeletarPessoaUseCase;
import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;

public class DeletarPessoaUseCaseImpl implements DeletarPessoaUseCase {
    private final PessoaGateway pessoaGateway;

    public DeletarPessoaUseCaseImpl(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }

    @Override
    public void execute(Pessoa pessoa) {
        pessoaGateway.apagarPessoa(pessoa);
    }
}