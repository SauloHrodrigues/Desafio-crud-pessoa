package com.desafio_pessoas02.Pessoa02.web.mappers_dto;

import com.desafio_pessoas02.Pessoa02.core.domain.entity.Endereco;
import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import com.desafio_pessoas02.Pessoa02.web.dtos.PessoaAtualizada;
import com.desafio_pessoas02.Pessoa02.web.dtos.PessoaRequest;
import com.desafio_pessoas02.Pessoa02.web.dtos.PessoaResponse;
import jdk.jshell.execution.FailOverExecutionControlProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PessoaDtoMapper {

    private final EnderecoDtoMapper enderecoMapper;

    public Pessoa toDomen(PessoaRequest dto){

        if(dto ==null) {
            return null;
        }
        Pessoa pessoa = new Pessoa(
                null,
                dto.nome(),
                dto.dataDeNascimento(),
                dto.cpf(),
                enderecoMapper.toDomain(dto.enderecos())
        );

        return pessoa;
    }

    public PessoaResponse toResponse(Pessoa pessoa){
        if(pessoa == null){
            return null;
        }

        return new PessoaResponse(
                pessoa.getId(),
                pessoa.getNome(),
                pessoa.getDataDeNascimento(),
                pessoa.getCpf(),
                enderecoMapper.getEnderecoPrincipalResponse(pessoa.getEnderecos()),
                enderecoMapper.toResponse(pessoa.getEnderecos())
        );
    }

    public Pessoa toUpdate(Long id,PessoaAtualizada atualizada){
        return new Pessoa(
                id,
                atualizada.nome(),
                atualizada.dataDeNascimento(),
                atualizada.cpf(),
                enderecoMapper.toUpdate(atualizada.enderecos())
        );
    }
}
