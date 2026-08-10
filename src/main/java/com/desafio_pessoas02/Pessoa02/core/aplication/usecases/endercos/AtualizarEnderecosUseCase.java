package com.desafio_pessoas02.Pessoa02.core.aplication.usecases.endercos;

import com.desafio_pessoas02.Pessoa02.core.domain.entity.Endereco;

public interface AtualizarEnderecosUseCase {
    Endereco excute(Long id, Endereco endereco);
}
