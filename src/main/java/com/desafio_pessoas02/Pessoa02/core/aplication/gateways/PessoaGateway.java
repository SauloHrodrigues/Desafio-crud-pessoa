package com.desafio_pessoas02.Pessoa02.core.aplication.gateways;

import com.desafio_pessoas02.Pessoa02.core.aplication.paginacao.Pagina;
import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface PessoaGateway {

    Pessoa criarPessoa(Pessoa pessoa);
    Pagina<Pessoa> listarPessoas(int pagina, int tamanho);
    Pessoa buscarPessoa(Long id);
    void apagarPessoa(Pessoa pessoa);
    Pessoa atualizarPessoa(Pessoa pessoa, Pessoa atualizacoes);
    Pessoa salvar(Pessoa pessoa);
}
