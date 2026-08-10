package com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.implementacoes;

import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.PessoaGateway;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.BuscarPessoaUseCase;
import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import com.desafio_pessoas02.Pessoa02.core.domain.exceptions.PessoaNaoEncontradaException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BuscarPessoaUseCaseImpl implements BuscarPessoaUseCase {

    private final PessoaGateway pessoaGateway;

    @Override
    public Pessoa execute(Long id) {
        var pessoa = pessoaGateway.buscarPessoa(id);

        if(pessoa == null){
            throw new PessoaNaoEncontradaException("Não há pessoa cadastrada no nosso banco com id: "+id);
        }

        return pessoa;
    }
}
