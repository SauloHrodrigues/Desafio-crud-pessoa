package com.desafio_pessoas02.Pessoa02.infrastructure.gateways;

import com.desafio_pessoas02.Pessoa02.core.domain.entity.Endereco;
import com.desafio_pessoas02.Pessoa02.core.domain.exceptions.EnderecoNaoEncontradoException;
import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.EnderecoGateway;
import com.desafio_pessoas02.Pessoa02.infrastructure.mapppers.EnderecoMapper;
import com.desafio_pessoas02.Pessoa02.infrastructure.mapppers.PessoaMapper;
import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.jpa.model.EnderecoModel;
import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.jpa.repository.EnderecoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class EnderecoGatewayImpl implements EnderecoGateway {
    private final EnderecoRepository repository;
    private final EnderecoMapper mapper;
    private final PessoaMapper pessoaMapper;

    @Override
    public Endereco criar(Endereco endereco) {
        return null;
    }

    @Override
    public Endereco buscar(Long id) {
        EnderecoModel enderecoModel= repository.findById(id).orElseThrow(
                ()-> new EnderecoNaoEncontradoException("Não foi encontrado nanhum endereço com id: "+id)
        );
        return mapper.toDomain(enderecoModel);
    }

    @Override
    public Endereco atualizar(Endereco existente, Endereco atualizado ) {
        EnderecoModel endereco = mapper.update(existente, atualizado);
        endereco.setPessoa(pessoaMapper.toModel(existente.getPessoa()));
        endereco = repository.save(endereco);
        return mapper.toDomain(endereco);
    }

    @Override
    public Endereco deletar(Long id) {
        return null;
    }

    @Override
    public Endereco salvar(Endereco endereco) {
        EnderecoModel enderecoModel = mapper.toModel(endereco);
        enderecoModel= repository.save(enderecoModel);
        return mapper.toDomain(enderecoModel);
    }
}
