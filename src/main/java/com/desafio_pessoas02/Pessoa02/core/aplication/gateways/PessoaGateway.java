package com.desafio_pessoas02.Pessoa02.core.aplication.gateways;

import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PessoaGateway {

    Pessoa criarPessoa(Pessoa pessoa);
    Page<Pessoa> listarPessoas(Pageable pageable);
    Pessoa buscarPessoa(Long id);
    void apagarPessoa(Pessoa pessoa);
    Pessoa atualizarPessoa(Pessoa pessoa, Pessoa atualizacoes);
    Integer calcularIdade(Pessoa pessoa);
}
