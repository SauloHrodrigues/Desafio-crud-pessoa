package com.desafio_pessoas02.Pessoa02.web.exception;


import com.desafio_pessoas02.Pessoa02.core.domain.exceptions.EnderecoNaoEncontradoException;
import com.desafio_pessoas02.Pessoa02.core.domain.exceptions.PessoaJaCadastradaException;
import com.desafio_pessoas02.Pessoa02.core.domain.exceptions.PessoaNaoEncontradaException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(PessoaJaCadastradaException.class)
    public ResponseEntity<Object> hendlerPessoaJaCadastradaException(PessoaJaCadastradaException exception){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(exception.getMessage());
    }

    @ExceptionHandler(EnderecoNaoEncontradoException.class)
    public ResponseEntity<Object> hendlerEnderecoNaoEncontradoException(EnderecoNaoEncontradoException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }

    @ExceptionHandler(PessoaNaoEncontradaException.class)
    public ResponseEntity<Object> hendlerPessoaNaoEncontradaException(PessoaNaoEncontradaException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }
}
