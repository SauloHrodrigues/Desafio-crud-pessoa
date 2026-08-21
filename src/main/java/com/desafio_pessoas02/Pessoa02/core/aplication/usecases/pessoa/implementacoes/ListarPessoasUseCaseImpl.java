package com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.implementacoes;

import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.LogGatway;
import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.PessoaGateway;
import com.desafio_pessoas02.Pessoa02.core.aplication.paginacao.Pagina;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.ListarPessoasUseCase;
import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import com.desafio_pessoas02.Pessoa02.core.domain.log.Log;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class ListarPessoasUseCaseImpl implements ListarPessoasUseCase {

    private final PessoaGateway pessoaGateway;
    private final LogGatway logGatway;

    public ListarPessoasUseCaseImpl(PessoaGateway pessoaGateway, LogGatway logGatway) {
        this.pessoaGateway = pessoaGateway;
        this.logGatway = logGatway;
    }

    @Override
    public Pagina<Pessoa> execute(int pagina, int tamanho) {
        logGatway.salvar(new Log("buacas","pessoas",null,"Retornar todas pessoas do banco"));
        return pessoaGateway.listarPessoas(pagina,tamanho);
    }
}
