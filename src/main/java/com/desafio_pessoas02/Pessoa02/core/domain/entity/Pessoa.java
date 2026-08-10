package com.desafio_pessoas02.Pessoa02.core.domain.entity;

import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Pessoa {

    private Long id;
    private String nome;
    private LocalDate dataDeNascimento;
    private String cpf;
    private List<Endereco> enderecos;

    public Pessoa(Long id, String nome, LocalDate dataDeNascimento, String cpf) {
        this.id = id;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.enderecos = new ArrayList<>();
    }

    public Pessoa(Long id, String nome, LocalDate dataDeNascimento, String cpf, List<Endereco> enderecos) {
        this.id = id;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        if(enderecos == null){
            this.enderecos = new ArrayList<>();
        } else {
            this.enderecos = enderecos;
        }

    }

    public void adicionarEndereco(Endereco endereco){
        if (enderecos == null){
            enderecos = new ArrayList<>();
        }
        enderecos.add(endereco);
    }

}