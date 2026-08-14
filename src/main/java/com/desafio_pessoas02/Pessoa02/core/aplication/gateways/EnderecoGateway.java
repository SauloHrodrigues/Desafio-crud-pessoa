package com.desafio_pessoas02.Pessoa02.core.aplication.gateways;

import com.desafio_pessoas02.Pessoa02.core.domain.entity.Endereco;

import java.util.Optional;

public interface EnderecoGateway {

    Endereco criar(Endereco endereco);
    Endereco buscar(Long id);
    Endereco atualizar(Endereco endereco, Endereco atualizacoes);
    Endereco deletar(Long id);
    Endereco salvar(Endereco endereco);
}
