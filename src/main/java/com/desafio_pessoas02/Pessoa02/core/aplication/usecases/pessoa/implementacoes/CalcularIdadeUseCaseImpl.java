package com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.implementacoes;

import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.PessoaGateway;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.CalcularIdadeUseCase;
import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class CalcularIdadeUseCaseImpl implements CalcularIdadeUseCase {
    private final PessoaGateway pessoaGateway;

    @Override
    public Map<String, Object> execute(Pessoa pessoa) {
        Map<String, Object> resposta = new HashMap<>();
        Integer idade = pessoaGateway.calcularIdade(pessoa);
        resposta.put("pessoa",pessoa);
        resposta.put("idade",idade);
        return resposta;
    }
}
