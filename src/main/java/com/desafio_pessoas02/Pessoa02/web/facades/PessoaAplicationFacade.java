package com.desafio_pessoas02.Pessoa02.web.facades;

import com.desafio_pessoas02.Pessoa02.web.dtos.PessoaAtualizada;
import com.desafio_pessoas02.Pessoa02.web.dtos.PessoaRequest;
import com.desafio_pessoas02.Pessoa02.web.dtos.PessoaResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Map;


public interface PessoaAplicationFacade {

    PessoaResponse criar(PessoaRequest request);

    Page<PessoaResponse> listar(Pageable pageable);

    Map<String, Object> retornarIdade(Long id);

    PessoaResponse atualizar(Long id, PessoaAtualizada atualizacoes);

    void deletar(Long id);
}
