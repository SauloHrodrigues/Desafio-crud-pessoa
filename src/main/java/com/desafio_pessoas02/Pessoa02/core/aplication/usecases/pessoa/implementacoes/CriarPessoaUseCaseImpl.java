package com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.implementacoes;

import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.LogGatway;
import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.PessoaGateway;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.CriarPessoaUseCase;
import com.desafio_pessoas02.Pessoa02.core.domain.log.Log;

public class CriarPessoaUseCaseImpl implements CriarPessoaUseCase {
  private final PessoaGateway pessoaGateway;
  private final LogGatway logGatway;

    public CriarPessoaUseCaseImpl(PessoaGateway pessoaGateway, LogGatway logGatway) {
        this.pessoaGateway = pessoaGateway;
        this.logGatway = logGatway;
    }

    @Override
    public Pessoa execute(Pessoa pessoa) {
       logGatway.salvar(new Log("Criando","Pessoa",20L,"criando nova pessoa"));
        return pessoaGateway.criarPessoa(pessoa);
    }
}
