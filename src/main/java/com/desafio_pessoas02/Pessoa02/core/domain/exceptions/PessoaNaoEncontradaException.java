package com.desafio_pessoas02.Pessoa02.core.domain.exceptions;

public class PessoaNaoEncontradaException extends RuntimeException {
    public PessoaNaoEncontradaException(String mensagem){
        super(mensagem);
    }
}
