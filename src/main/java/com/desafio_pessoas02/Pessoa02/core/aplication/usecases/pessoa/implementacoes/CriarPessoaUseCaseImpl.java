package com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.implementacoes;

import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.PessoaGateway;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.CriarPessoaUseCase;

public class CriarPessoaUseCaseImpl implements CriarPessoaUseCase {
  private final PessoaGateway pessoaGateway;

    public CriarPessoaUseCaseImpl(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }

    @Override
    public Pessoa execute(Pessoa pessoa) {
        return pessoaGateway.criarPessoa(pessoa);
    }
}
