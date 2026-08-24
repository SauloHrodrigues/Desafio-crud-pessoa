package com.desafio_pessoas02.Pessoa02.infrastructure.persistence.jpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_pessoas")
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate dataDeNascimento;
    private String cpf;
    @OneToMany(
            mappedBy = "pessoa",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonIgnore
    private List<EnderecoModel> enderecos = new ArrayList<>();

    public void adicionarEndereco(EnderecoModel model){
        if(enderecos == null){
            enderecos = new ArrayList<>();
        }
        enderecos.add(model);
    }

}