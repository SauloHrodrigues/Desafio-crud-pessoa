package com.desafio_pessoas02.Pessoa02.core.domain.exceptions;

public class PessoaJaCadastradaException extends RuntimeException {
    public PessoaJaCadastradaException(String mensagem){
        super(mensagem);
    }
}
