package com.desafio_pessoas02.Pessoa02.service.implementacoes.fixture;

import com.desafio_pessoas02.Pessoa02.codigo_antigo.dtos.PessoaRequest;
import com.desafio_pessoas02.Pessoa02.codigo_antigo.dtos.PessoaResponse;
import com.desafio_pessoas02.Pessoa02.codigo_antigo.model.EnderecoEntity;
import com.desafio_pessoas02.Pessoa02.codigo_antigo.model.PessoaEntity;

import java.time.LocalDate;
import java.util.ArrayList;

public class PessoaFixture {
//
//    private static final Long ID = 1L;
//    private static final String NOME = "Jose Ferreira da Silva";
//    private static final LocalDate DATA_NASCIMENTO = LocalDate.of(1978, 9, 12);
//    private static final String CPF = "22244488866";
//
//    public static PessoaRequest request() {
//        PessoaEntity pessoaEntity = entity();
//        return new PessoaRequest(
//                pessoaEntity.getNome(),
//                pessoaEntity.getDataDeNascimento(),
//                pessoaEntity.getCpf(),
//                EnderecoFixture.listaDeRequest(pessoaEntity.getEnderecoEntities())
//        );
//    }
//
//    public static PessoaRequest request(PessoaEntity pessoaEntity) {
//        return new PessoaRequest(
//                pessoaEntity.getNome(),
//                pessoaEntity.getDataDeNascimento(),
//                pessoaEntity.getCpf(),
//                EnderecoFixture.listaDeRequest(pessoaEntity.getEnderecoEntities())
//        );
//    }
//
//    public static PessoaEntity entity() {
//        PessoaEntity pessoaEntity = PessoaEntity.builder()
//                .id(ID)
//                .nome(NOME)
//                .dataDeNascimento(DATA_NASCIMENTO)
//                .cpf(CPF)
//                .enderecos(new ArrayList<>())
//                .build();
//
//        EnderecoEntity enderecoEntity = EnderecoFixture.entity();
//        enderecoEntity.setPessoaEntity(pessoaEntity);
//        pessoaEntity.addEndereco(enderecoEntity);
//        return pessoaEntity;
//    }
//
//    public static PessoaResponse response(PessoaEntity pessoaEntity) {
//
//        return new PessoaResponse(
//                pessoaEntity.getId(),
//                pessoaEntity.getNome(),
//                pessoaEntity.getDataDeNascimento(),
//                pessoaEntity.getCpf(),
//                EnderecoFixture.listaDeResponse(pessoaEntity.getEnderecoEntities())
//
//        );
//    }
}