package com.desafio_pessoas02.Pessoa02.core.aplication.usecases.endercos.implementacoes;

import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.LogGatway;
import com.desafio_pessoas02.Pessoa02.core.domain.entity.Endereco;
import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.EnderecoGateway;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.endercos.AtualizarEnderecosUseCase;
import com.desafio_pessoas02.Pessoa02.core.domain.log.Log;

public class AtualizarEnderecosUseCaseImpl implements AtualizarEnderecosUseCase {

    private final EnderecoGateway enderecoGateway;
    private final LogGatway logGatway;

    public AtualizarEnderecosUseCaseImpl(EnderecoGateway enderecoGateway, LogGatway logGatway) {
        this.enderecoGateway = enderecoGateway;
        this.logGatway = logGatway;
    }

    @Override
    public Endereco excute(Long id, Endereco atualizado) {
        Endereco existente = enderecoGateway.buscar(id);
        Log log = logGatway.salvar(new Log("atualizando","Endereço", existente.getId(), "atualizando o endereço."));
        return enderecoGateway.atualizar(existente,atualizado);
    }
}
