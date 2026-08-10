package com.desafio_pessoas02.Pessoa02.web.dtos;

import java.time.LocalDate;
import java.util.List;

public record PessoaResponse(
        Long id,
        String nome,
        LocalDate dataDeNascimento,
        String cpf,
        EnderecoResponse enderecoPricipal,
        List<EnderecoResponse> enderecosCadstrados
) {
}
