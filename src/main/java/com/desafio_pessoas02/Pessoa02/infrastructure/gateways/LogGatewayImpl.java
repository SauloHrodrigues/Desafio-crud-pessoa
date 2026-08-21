package com.desafio_pessoas02.Pessoa02.infrastructure.gateways;

import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.LogGatway;
import com.desafio_pessoas02.Pessoa02.core.domain.log.Log;
import com.desafio_pessoas02.Pessoa02.infrastructure.mapppers.LogMapper;
import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.mongo.model.LogModel;
import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.mongo.repository.LogRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@RequiredArgsConstructor
@Service
public class LogGatewayImpl implements LogGatway {
    private final LogRepository repository;
    private final LogMapper mapper;

    @Override
    public Log salvar(Log log) {
        LogModel model = mapper.toModel(log);
        model = repository.save(model);
        infLog(model.getMensagem());
        return mapper.toEntity(model);
    }

    @Override
    public List<Log> listar() {
        List<Log> resposta = new ArrayList<>();
        List<LogModel>logs = repository.findAll();

        for (LogModel log:logs){
            resposta.add(mapper.toEntity(log));
        }

        return resposta;
    }

    @Override
    public void infLog(String mensagem) {
        log.info(mensagem);
    }
}
