package com.desafio_pessoas02.Pessoa02.infrastructure.gateways;

import com.desafio_pessoas02.Pessoa02.core.aplication.gateways.PessoaGateway;
import com.desafio_pessoas02.Pessoa02.core.aplication.paginacao.Pagina;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.endercos.AtualizarEnderecosUseCase;
import com.desafio_pessoas02.Pessoa02.core.domain.entity.Endereco;
import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import com.desafio_pessoas02.Pessoa02.infrastructure.mapppers.EnderecoMapper;
import com.desafio_pessoas02.Pessoa02.infrastructure.mapppers.PessoaMapper;
import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.model.EnderecoModel;
import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.model.PessoaModel;
import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

@RequiredArgsConstructor
@Component
public class PessoaGatewayImpl implements PessoaGateway {

    private final PessoaRepository repository;
    private final PessoaMapper mapper;
    private final AtualizarEnderecosUseCase atualizarEnderecosUseCase;

    @Override
    public Pessoa criarPessoa(Pessoa request) {
        List<Endereco> enderecos = validaEnderecoPrincipal(request.getEnderecos());
        Pessoa pessoa = new Pessoa(null,request.getNome(),request.getDataDeNascimento(), request.getCpf(),enderecos);
        PessoaModel  model = mapper.toModel(pessoa);
        model = repository.save(model);
        return mapper.toDomain(model);
    }

    @Override
    public Pagina<Pessoa> listarPessoas(int pagina, int tamanho) {
        Pageable pageable = PageRequest.of(pagina, tamanho);
        Page<PessoaModel> resultado = repository.findAll(pageable);
        return new Pagina<>(
                resultado.getContent()
                        .stream()
                        .map(mapper::toDomain)
                        .toList(),
                resultado.getNumber(),
                resultado.getSize(),
                resultado.getTotalElements(),
                resultado.getTotalPages()
        );
    }

    @Override
    public Pessoa buscarPessoa(Long id) {
        Optional<PessoaModel> model = repository.findById(id);
        return model.map(mapper::toDomain).orElse(null);
    }

    @Override
    public void apagarPessoa(Pessoa pessoa) {
        PessoaModel model = mapper.toModel(pessoa);
        repository.delete(model);
    }

    @Override
    public Pessoa atualizarPessoa(Pessoa pessoa, Pessoa atualizacoes) {
        PessoaModel pessoaModel = mapper.toUpdate(pessoa, atualizacoes);
        pessoaModel = repository.save(pessoaModel);

        return mapper.toDomain(pessoaModel);
    }

    @Override
    public Pessoa salvar(Pessoa pessoa) {
        PessoaModel pessoaModel = mapper.toModel(pessoa);
        pessoaModel= repository.save(pessoaModel);
        return mapper.toDomain(pessoaModel);
    }

    public List<Endereco> validaEnderecoPrincipal(List<Endereco> enderecos){
        Endereco principal = null;
        List<Endereco> atualizado = new ArrayList<>();

        for (Endereco endereco : enderecos) {
            if (principal == null && Boolean.TRUE.equals(endereco.getEnderecoPrincipal())){
                principal = endereco;
                atualizado.add(endereco);
            } else {
                endereco.setEnderecoPrincipal(false);
                atualizado.add(endereco);
            }
        }
        return atualizado;
    }

}
