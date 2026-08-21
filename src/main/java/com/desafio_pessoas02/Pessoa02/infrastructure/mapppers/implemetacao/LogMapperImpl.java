package com.desafio_pessoas02.Pessoa02.infrastructure.mapppers.implemetacao;

import com.desafio_pessoas02.Pessoa02.core.domain.log.Log;
import com.desafio_pessoas02.Pessoa02.infrastructure.mapppers.LogMapper;
import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.mongo.model.LogModel;
import org.springframework.stereotype.Component;

@Component
public class LogMapperImpl implements LogMapper {
    @Override
    public Log toEntity(LogModel logModel) {
        return new Log(
                logModel.getId(),
                logModel.getDataHora(),
                logModel.getOperacao(),
                logModel.getEntidade(),
                logModel.getEntidadeId(),
                logModel.getMensagem()
        );
    }

    @Override
    public LogModel toModel(Log log) {
        return LogModel.builder()
                .dataHora(log.getDataHora())
                .operacao(log.getOperacao())
                .entidade(log.getEntidade())
                .entidadeId(log.getEntidadeId())
                .mensagem(log.getMensagem())
                .build();
    }
}
