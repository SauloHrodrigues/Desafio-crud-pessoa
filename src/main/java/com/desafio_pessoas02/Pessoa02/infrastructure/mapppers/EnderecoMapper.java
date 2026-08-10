package com.desafio_pessoas02.Pessoa02.infrastructure.mapppers;

import com.desafio_pessoas02.Pessoa02.core.domain.entity.Endereco;
import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.model.EnderecoModel;
import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.model.PessoaModel;

import java.util.List;

public interface EnderecoMapper {
    Endereco toDomain(EnderecoModel model);
    EnderecoModel toModel(Endereco endereco );
    EnderecoModel update(Endereco endereco, Endereco atualizacoes);
}
