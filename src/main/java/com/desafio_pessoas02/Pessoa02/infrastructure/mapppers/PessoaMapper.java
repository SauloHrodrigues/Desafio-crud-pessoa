package com.desafio_pessoas02.Pessoa02.infrastructure.mapppers;

import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.model.PessoaModel;

import java.util.List;

public interface PessoaMapper {
    Pessoa toDomain(PessoaModel model);
    PessoaModel toUpdate(Pessoa pessoa, Pessoa atualizacoes);
    PessoaModel toModel(Pessoa pessoa);
}