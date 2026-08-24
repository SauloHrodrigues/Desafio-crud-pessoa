package com.desafio_pessoas02.Pessoa02.infrastructure.mapppers;

import com.desafio_pessoas02.Pessoa02.core.domain.log.Log;
import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.mongo.model.LogModel;

public interface LogMapper {
    Log toEntity(LogModel logModel);
    LogModel toModel(Log log);
}