package com.desafio_pessoas02.Pessoa02.core.domain.entity;

import lombok.Getter;

import java.time.LocalDate;
import java.time.Period;
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

    public Integer getIdade(){
        LocalDate hoje = LocalDate.now();
        return Period.between(this.getDataDeNascimento(), hoje).getYears();
    }

    public Endereco getEnderecoPrincipal() {
        for (Endereco endereco: this.getEnderecos()){
            if(endereco.getEnderecoPrincipal()){
                return endereco;
            }
        }
        return null;
    }

    public void setEnderecoPrincipal(Endereco endereco){
        Endereco atual = getEnderecoPrincipal();
        if(atual != null){
            atual.setEnderecoPrincipal(false);
            endereco.setEnderecoPrincipal(true);
        }
    }


}