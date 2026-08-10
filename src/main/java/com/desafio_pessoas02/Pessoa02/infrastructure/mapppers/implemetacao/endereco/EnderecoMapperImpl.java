package com.desafio_pessoas02.Pessoa02.infrastructure.mapppers.implemetacao.endereco;

import com.desafio_pessoas02.Pessoa02.core.domain.entity.Endereco;
import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import com.desafio_pessoas02.Pessoa02.infrastructure.mapppers.EnderecoMapper;
import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.model.EnderecoModel;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class EnderecoMapperImpl implements EnderecoMapper {

    public Endereco toDomain(EnderecoModel model) {
        return new Endereco(
                model.getId(),
                model.getRua(),
                model.getNumero(),
                model.getBairro(),
                model.getCidade(),
                model.getEstado(),
                model.getCep(),
                model.getEnderecoPrincipal(),
                null
        );
    }

    public List<Endereco> toDomain(List<EnderecoModel> modelList) {
        if (modelList == null) {
            return null;
        }

        List<Endereco> enderecos = new ArrayList<>();

        for (EnderecoModel model : modelList) {
            enderecos.add(toDomain(model));
        }
        return enderecos;
    }

    public EnderecoModel toModel(Endereco endereco) {
        EnderecoModel model = EnderecoModel.builder()
                .id(endereco.getId())
                .rua(endereco.getRua())
                .numero(endereco.getNumero())
                .bairro(endereco.getBairro())
                .cidade(endereco.getCidade())
                .estado(endereco.getEstado())
                .cep(endereco.getCep())
                .enderecoPrincipal(endereco.getEnderecoPrincipal())
                .dataDeCadastro(endereco.getDataDecadastro())
                .build();
        return model;
    }

    public List<EnderecoModel> toModel(List<Endereco> enderecos) {
        if (enderecos == null) {
            return null;
        }

        List<EnderecoModel> modes = new ArrayList<>();

        for (Endereco endereco : enderecos) {
            modes.add(toModel(endereco));
        }

        return modes;
    }

    public EnderecoModel update(Endereco endereco, Endereco atualizacoes) {
        return new EnderecoModel(
                endereco.getId(),
                atualizacoes.getRua() != null ? atualizacoes.getRua() : endereco.getRua(),
                atualizacoes.getNumero() != null ? atualizacoes.getNumero() : endereco.getNumero(),
                atualizacoes.getBairro() != null ? atualizacoes.getBairro() : endereco.getBairro(),
                atualizacoes.getCidade() != null ? atualizacoes.getCidade() : endereco.getCidade(),
                atualizacoes.getEstado() != null ? atualizacoes.getEstado() : endereco.getEstado(),
                atualizacoes.getCep() != null ? atualizacoes.getCep() : endereco.getCep(),
                atualizacoes.getEnderecoPrincipal() != null ? atualizacoes.getEnderecoPrincipal() : endereco.getEnderecoPrincipal(),
                LocalDate.now(),
                null
        );
    }
}
