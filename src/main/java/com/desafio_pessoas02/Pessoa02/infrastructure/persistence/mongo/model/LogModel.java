package com.desafio_pessoas02.Pessoa02.infrastructure.persistence.mongo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
@Getter
@Setter
@Builder
@Document(collection = "logs")
public class LogModel {

    @Id
    private String id;
    private LocalDateTime dataHora;
    private String operacao;
    private String entidade;
    private Long entidadeId;
    private String mensagem;

    public LogModel(String operacao, String entidade, Long entidadeId, String mensagem) {
        this.operacao = operacao;
        this.entidade = entidade;
        this.entidadeId = entidadeId;
        this.mensagem = mensagem;
    }

    public LogModel(String id, LocalDateTime dataHora, String operacao, String entidade, Long entidadeId, String mensagem) {
        this.id = id;
        this.dataHora = dataHora;
        this.operacao = operacao;
        this.entidade = entidade;
        this.entidadeId = entidadeId;
        this.mensagem = mensagem;
    }
}