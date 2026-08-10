package com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa;

import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;

import java.util.Map;
import java.util.Objects;

public interface CalcularIdadeUseCase {
    Map<String, Object> execute(Pessoa pessoa);
}