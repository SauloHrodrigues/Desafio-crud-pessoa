package com.desafio_pessoas02.Pessoa02.core.aplication.gateways;

import com.desafio_pessoas02.Pessoa02.core.domain.log.Log;

import java.util.List;

public interface LogGatway {
    Log salvar(Log log);
    List<Log> listar();
    void infLog(String mensagem);
}
