package com.desafio_pessoas02.Pessoa02.web.mappers_dto;

import com.desafio_pessoas02.Pessoa02.core.domain.entity.Endereco;
import com.desafio_pessoas02.Pessoa02.web.dtos.EnderecoAtualizado;
import com.desafio_pessoas02.Pessoa02.web.dtos.EnderecoRequest;
import com.desafio_pessoas02.Pessoa02.web.dtos.EnderecoResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EnderecoDtoMapper {

    public List<Endereco> toDomain(List<EnderecoRequest> requests) {

        if (requests == null || requests.isEmpty()) {
            return new ArrayList<>();
        }

        List<Endereco> enderecos = new ArrayList<>();

        for (EnderecoRequest request : requests) {
            enderecos.add(toDomain(request));
        }

        return enderecos;
    }

    public Endereco toDomain(EnderecoRequest request) {
        return new Endereco(
                null,
                request.rua(),
                request.numero(),
                request.bairro(),
                request.cidade(),
                request.estado(),
                request.cep(),
                request.enderecoPrincipal(),
                null

        );
    }

    public List<Endereco> toUpdate(List<EnderecoAtualizado>enderecoAtualizados){
        if (enderecoAtualizados == null){
            return null;
        }

        List<Endereco> enderecos = new ArrayList<>();

        for (EnderecoAtualizado atualizado:enderecoAtualizados){
            enderecos.add(toUpdate(atualizado));
        }

        return enderecos;
    }

    public Endereco toUpdate(EnderecoAtualizado atualizacoes) {
      if(atualizacoes.id() == null){
          return null;
      }
       return new Endereco(
                atualizacoes.id(),
                atualizacoes.rua(),
                atualizacoes.numero(),
                atualizacoes.bairro(),
                atualizacoes.cidade(),
                atualizacoes.estado(),
                atualizacoes.cep(),
                atualizacoes.endrecoPrincipal(),
                null
        );
    }

    public EnderecoResponse toResponse(Endereco endereco){
        if(endereco == null){
            return null;
        }

        return new EnderecoResponse(
                endereco.getId(),
                endereco.getRua(),
                endereco.getNumero(),
                endereco.getBairro(),
                endereco.getCidade(),
                endereco.getEstado(),
                endereco.getCep()
        );
    }

    public List<EnderecoResponse> toResponse(List<Endereco> enderecos){
        if(enderecos == null){
            return null;
        }

        List<EnderecoResponse> responses = new ArrayList<>();

        for (Endereco endereco:enderecos){
            responses.add(toResponse(endereco));
        }

        return responses;
    }

    public EnderecoResponse getEnderecoPrincipalResponse(List<Endereco>enderecos){
        EnderecoResponse response= null;

        for(Endereco end:enderecos){
            if(end.getEnderecoPrincipal()){
                response = toResponse(end);
                break;
            }
        }
        return response;
    }
}
