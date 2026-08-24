package com.desafio_pessoas02.Pessoa02.web.controllers;

import com.desafio_pessoas02.Pessoa02.web.dtos.PessoaAtualizada;
import com.desafio_pessoas02.Pessoa02.web.dtos.PessoaRequest;
import com.desafio_pessoas02.Pessoa02.web.dtos.PessoaResponse;
import com.desafio_pessoas02.Pessoa02.web.facades.Implementacao.PessoaFacade;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/pessoas")
@RequiredArgsConstructor
public class PessoaController {// implements PessoaSwaggerI {

    private final PessoaFacade service;

    @PostMapping
    public ResponseEntity<Map<String, PessoaResponse>> criar(@RequestBody PessoaRequest request) {
        Map<String, PessoaResponse> reponse = new HashMap<>();
        reponse.put("Pessoa criada", service.criar(request));
        return ResponseEntity.status(HttpStatus.OK).body(reponse);
    }

    @GetMapping
    public ResponseEntity<Page<PessoaResponse>> retornarTodasPessoas(Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(service.listar(pageable));
    }

    @GetMapping("/{id}/mostrar_idade")
    public ResponseEntity<Map<String, Object>> retornarIdade(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.retornarIdade(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PessoaResponse> atualizarPessoa(@PathVariable Long id, @RequestBody @Valid PessoaAtualizada atualizacoes) {
        return ResponseEntity.status(HttpStatus.OK).body(service.atualizar(id, atualizacoes));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}