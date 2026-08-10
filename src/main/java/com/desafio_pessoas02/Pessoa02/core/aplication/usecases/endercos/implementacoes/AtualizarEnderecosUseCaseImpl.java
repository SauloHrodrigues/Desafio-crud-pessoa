package com.desafio_pessoas02.Pessoa02.core.aplication.usecases.endercos.implementacoes;

import com.desafio_pessoas02.Pessoa02.core.domain.entity.Endereco;
import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.EnderecoGateway;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.endercos.AtualizarEnderecosUseCase;

public class AtualizarEnderecosUseCaseImpl implements AtualizarEnderecosUseCase {

    private final EnderecoGateway enderecoGateway;

    public AtualizarEnderecosUseCaseImpl(EnderecoGateway enderecoGateway) {
        this.enderecoGateway = enderecoGateway;
    }

    @Override
    public Endereco excute(Long id, Endereco atualizado) {
        Endereco existente = enderecoGateway.buscar(id);

        return enderecoGateway.atualizar(existente,atualizado);
    }
}
