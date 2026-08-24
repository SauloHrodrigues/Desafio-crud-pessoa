package com.desafio_pessoas02.Pessoa02.core.domain.entity;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Endereco {
    private Long id;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private Boolean enderecoPrincipal;
    private Pessoa pessoa;
    private LocalDate dataDecadastro;

    public Endereco(Long id, String rua, String numero, String bairro, String cidade,
                    String estado, String cep, Boolean enderecoPrincipal, Pessoa pessoa) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.enderecoPrincipal = enderecoPrincipal;
        this.pessoa = pessoa;
        this.dataDecadastro = LocalDate.now();
    }

    public void setEnderecoPrincipal(boolean escolha){
        this.enderecoPrincipal = escolha;
    }

    public void adicionarPessoa(Pessoa pessoa){
        if(this.pessoa == null){
            this.pessoa=pessoa;
        }
    }
}
