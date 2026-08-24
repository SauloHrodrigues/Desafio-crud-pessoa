package com.desafio_pessoas02.Pessoa02.infrastructure.persistence.mongo.repository;

import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.mongo.model.LogModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository  extends MongoRepository<LogModel, String> {
}
