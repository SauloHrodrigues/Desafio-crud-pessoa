package com.desafio_pessoas02.Pessoa02.web.dtos;

import java.time.LocalDate;

public record PessoaIdadeResponse(
        Long id,
        String nome,
        String cpf,
        LocalDate dataDeNascimento,
        int idade
) {
}
