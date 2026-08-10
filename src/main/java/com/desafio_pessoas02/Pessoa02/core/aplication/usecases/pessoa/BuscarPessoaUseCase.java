package com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa;

import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;

public interface BuscarPessoaUseCase {
    Pessoa execute(Long id);
}
