package com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa;

import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ListarPessoasUseCase {
    Page<Pessoa> execute(Pageable pageable);
}
