package com.desafio_pessoas02.Pessoa02.core.domain.log;

import java.time.LocalDateTime;

public class Log {

    private String id;
    private LocalDateTime dataHora;
    private String operacao;
    private String entidade;
    private Long entidadeId;
    private String mensagem;

    public Log(String operacao, String entidade, Long entidadeId, String mensagem) {
        this.dataHora = LocalDateTime.now();
        this.operacao = operacao;
        this.entidade = entidade;
        this.entidadeId = entidadeId;
        this.mensagem = mensagem;
    }

    public Log(String id, LocalDateTime dataHora, String operacao, String entidade, Long entidadeId, String mensagem) {
        this.id = id;
        this.dataHora = dataHora;
        this.operacao = operacao;
        this.entidade = entidade;
        this.entidadeId = entidadeId;
        this.mensagem = mensagem;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getOperacao() {
        return operacao;
    }

    public String getEntidade() {
        return entidade;
    }

    public Long getEntidadeId() {
        return entidadeId;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public void setEntidade(String entidade) {
        this.entidade = entidade;
    }

    public void setEntidadeId(Long entidadeId) {
        this.entidadeId = entidadeId;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "Log{" +
                "mensagem='" + mensagem + '\'' +
                ", entidadeId=" + entidadeId +
                ", entidade='" + entidade + '\'' +
                ", operacao='" + operacao + '\'' +
                ", dataHora=" + dataHora +
                '}';
    }
}
