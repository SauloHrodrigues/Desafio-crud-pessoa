package com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.implementacoes;

import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.LogGatway;
import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.PessoaGateway;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.DeletarPessoaUseCase;
import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import com.desafio_pessoas02.Pessoa02.core.domain.log.Log;

public class DeletarPessoaUseCaseImpl implements DeletarPessoaUseCase {
    private final PessoaGateway pessoaGateway;
    private final LogGatway logGatway;

    public DeletarPessoaUseCaseImpl(PessoaGateway pessoaGateway, LogGatway logGatway) {
        this.pessoaGateway = pessoaGateway;
        this.logGatway = logGatway;
    }

    @Override
    public void execute(Pessoa pessoa) {
        logGatway.salvar(new Log("Deletando", "Pessoa", pessoa.getId(), "Deletando pessoa do banco"));
        pessoaGateway.apagarPessoa(pessoa);
    }
}