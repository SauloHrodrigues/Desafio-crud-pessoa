package com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.implementacoes;

import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.LogGatway;
import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.PessoaGateway;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.AtualizarPessoaUseCase;
import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import com.desafio_pessoas02.Pessoa02.core.domain.log.Log;

public class AtualizarPessoaUseCaseImpl implements AtualizarPessoaUseCase {
    private final PessoaGateway pessoaGateway;
    public final LogGatway logGatway;

    public AtualizarPessoaUseCaseImpl(PessoaGateway pessoaGateway, LogGatway logGatway) {
        this.pessoaGateway = pessoaGateway;
        this.logGatway = logGatway;
    }

    @Override
    public Pessoa execute(Pessoa pessoa) {
        Pessoa existente = pessoaGateway.buscarPessoa(pessoa.getId());

        if (existente == null) {
            throw new RuntimeException("Pessoa não encontrada");
        }

        logGatway.salvar(new Log("atualizando", "Pessoa",
                existente.getId(), "atualizando a pessoa."));
        return pessoaGateway.atualizarPessoa(existente, pessoa);
    }
}
