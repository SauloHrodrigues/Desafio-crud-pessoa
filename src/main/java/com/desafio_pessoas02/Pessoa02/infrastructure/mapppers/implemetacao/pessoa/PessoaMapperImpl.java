package com.desafio_pessoas02.Pessoa02.infrastructure.mapppers.implemetacao.pessoa;

import com.desafio_pessoas02.Pessoa02.core.domain.entity.Endereco;
import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import com.desafio_pessoas02.Pessoa02.infrastructure.mapppers.EnderecoMapper;
import com.desafio_pessoas02.Pessoa02.infrastructure.mapppers.PessoaMapper;
import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.jpa.model.EnderecoModel;
import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.jpa.model.PessoaModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@RequiredArgsConstructor
@Component
public class PessoaMapperImpl implements PessoaMapper {
    private final EnderecoMapper enderecoMapper;

    @Override
    public Pessoa toDomain(PessoaModel model) {
        if(model == null) {
            return null;
        }

        Pessoa pessoa = new Pessoa(
                model.getId(),
                model.getNome(),
                model.getDataDeNascimento(),
                model.getCpf()
        );

        for (EnderecoModel enderecoModel: model.getEnderecos()){
            Endereco endereco = enderecoMapper.toDomain(enderecoModel);
            endereco.adicionarPessoa(pessoa);
            pessoa.getEnderecos().add(endereco);
        }

        return pessoa;
    }


    @Override
    public PessoaModel toUpdate(Pessoa pessoa, Pessoa atualizacoes) {

        PessoaModel pessoaModel = PessoaModel.builder()
                .id(pessoa.getId())
                .nome(atualizacoes.getNome() == null ? pessoa.getNome() : atualizacoes.getNome())
                .dataDeNascimento(atualizacoes.getDataDeNascimento() == null ? pessoa.getDataDeNascimento(): atualizacoes.getDataDeNascimento())
                .cpf(  atualizacoes.getCpf() == null ? pessoa.getCpf() : atualizacoes.getCpf())
                .build();

        for (Endereco endereco: pessoa.getEnderecos()){
            EnderecoModel model = enderecoMapper.toModel(endereco);
            if (!CollectionUtils.isEmpty(atualizacoes.getEnderecos())){
                for (Endereco atual: atualizacoes.getEnderecos()){
                    if(endereco.getId().equals(atual.getId())){
                        model = enderecoMapper.update(endereco,atual);
                    }
                }
            }
            model.setPessoa(pessoaModel);
            pessoaModel.adicionarEndereco(model);
        }

        return pessoaModel;
    }

    @Override
    public PessoaModel toModel(Pessoa pessoa) {
        if(pessoa == null){
            return null;
        }
        PessoaModel pessoaModel = PessoaModel.builder()
                .id(pessoa.getId())
                .nome(pessoa.getNome())
                .dataDeNascimento(pessoa.getDataDeNascimento())
                .cpf(pessoa.getCpf())
                .build();

        for (Endereco endereco: pessoa.getEnderecos()){
            EnderecoModel model = enderecoMapper.toModel(endereco);
            model.setPessoa(pessoaModel);
            pessoaModel.adicionarEndereco(model);
        }
        return pessoaModel;
    }
}