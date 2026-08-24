package com.desafio_pessoas02.Pessoa02.web.dtos;

public record EnderecoResponse(

        Long id,
        String rua,
        String numero,
        String bairro,
        String cidade,
        String estado,
        String cep
) {
}
