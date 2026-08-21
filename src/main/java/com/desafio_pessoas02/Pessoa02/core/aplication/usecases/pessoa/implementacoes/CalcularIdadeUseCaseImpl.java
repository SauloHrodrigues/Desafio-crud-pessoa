package com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.implementacoes;

import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.LogGatway;
import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.PessoaGateway;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.CalcularIdadeUseCase;
import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import com.desafio_pessoas02.Pessoa02.core.domain.log.Log;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;


public class CalcularIdadeUseCaseImpl implements CalcularIdadeUseCase {
    private final PessoaGateway pessoaGateway;
    private final LogGatway logGatway;

    public CalcularIdadeUseCaseImpl(PessoaGateway pessoaGateway, LogGatway logGatway) {
        this.pessoaGateway = pessoaGateway;
        this.logGatway = logGatway;
    }

    @Override
    public Map<String, Object> execute(Pessoa pessoa) {
        Map<String, Object> resposta = new HashMap<>();
        Integer idade = pessoa.getIdade();
        logGatway.salvar(new Log("Calculando idade", "Pessoa",
                pessoa.getId(), "calculando idade da pessoa."));

        resposta.put("pessoa",pessoa);
        resposta.put("idade",idade);
        return resposta;
    }
}
