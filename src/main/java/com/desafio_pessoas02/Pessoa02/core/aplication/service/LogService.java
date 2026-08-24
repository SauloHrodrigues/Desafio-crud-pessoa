package com.desafio_pessoas02.Pessoa02.core.aplication.service;

import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.LogGatway;
import com.desafio_pessoas02.Pessoa02.core.domain.log.Log;

import java.time.LocalDateTime;
import java.util.List;

public class LogService {
    private final LogGatway logGatway;

    public LogService(LogGatway logGatway) {
        this.logGatway = logGatway;
    }

    public void registrarLog(String operacao, String entidade, Long idEntidade, String mensagem){
        LocalDateTime agora = LocalDateTime.now();
        logGatway.salvar(new Log(operacao,entidade,idEntidade,mensagem));
    }

    public List<Log> getLogs(){
        return logGatway.listar();
    }
}
