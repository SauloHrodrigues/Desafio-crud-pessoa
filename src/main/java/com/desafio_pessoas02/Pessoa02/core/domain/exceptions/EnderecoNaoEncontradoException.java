package com.desafio_pessoas02.Pessoa02.core.domain.exceptions;

public class EnderecoNaoEncontradoException extends RuntimeException {
    public EnderecoNaoEncontradoException(String mensagem){
        super(mensagem);
    }
}
