package com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.implementacoes;

import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.PessoaGateway;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.ListarPessoasUseCase;
import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@RequiredArgsConstructor
public class ListarPessoasUseCaseImpl implements ListarPessoasUseCase {

    private final PessoaGateway pessoaGateway;

    @Override
    public Page<Pessoa> execute(Pageable pageable) {
        return pessoaGateway.listarPessoas(pageable);
    }
}
