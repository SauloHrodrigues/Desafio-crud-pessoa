package com.desafio_pessoas02.Pessoa02.web.facades.Implementacao;

import com.desafio_pessoas02.Pessoa02.core.aplication.paginacao.Pagina;
import com.desafio_pessoas02.Pessoa02.core.aplication.usecases.pessoa.*;
import com.desafio_pessoas02.Pessoa02.core.domain.entity.Pessoa;
import com.desafio_pessoas02.Pessoa02.web.dtos.PessoaAtualizada;
import com.desafio_pessoas02.Pessoa02.web.dtos.PessoaRequest;
import com.desafio_pessoas02.Pessoa02.web.dtos.PessoaResponse;
import com.desafio_pessoas02.Pessoa02.web.facades.PessoaAplicationFacade;
import com.desafio_pessoas02.Pessoa02.web.mappers_dto.PessoaDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class PessoaFacade implements PessoaAplicationFacade {

    private final PessoaDtoMapper pessoaMapper;
    private final CriarPessoaUseCase criarPessoaUseCase;
    private final AtualizarPessoaUseCase atualizarPessoaUseCase;
    private final ListarPessoasUseCase listarPessoasUseCase;
    private final DeletarPessoaUseCase deletarPessoaUseCase;
    private final BuscarPessoaUseCase buscarPessoaUseCase;

    public PessoaResponse criar(PessoaRequest request) {
        Pessoa pessoa = pessoaMapper.toDomen(request);
        pessoa = criarPessoaUseCase.execute(pessoa);
        return pessoaMapper.toResponse(pessoa);
    }

    @Override
    public Page<PessoaResponse> listar(Pageable pageable) {
        Pagina<Pessoa> resultado =
                listarPessoasUseCase.execute(
                        pageable.getPageNumber(),
                        pageable.getPageSize()
                );

        List<PessoaResponse> pessoas = resultado.conteudo()
                .stream()
                .map(pessoaMapper::toResponse)
                .toList();

        return new PageImpl<>(
                pessoas,
                pageable,
                resultado.totalElementos()
        );
    }

    @Override
    public Map<String, Object> retornarIdade(Long id) {
        Map<String, Object> resposta = new HashMap<>();
        Pessoa pessoa = buscarPessoaUseCase.execute(id);
        resposta.put("Pessoa: ",pessoaMapper.toResponse(pessoa));
        resposta.put("Idade: ",(Integer) pessoa.getIdade());
        return resposta;
    }

    @Override
    public PessoaResponse atualizar(Long id, PessoaAtualizada atualizacoes) {
        Pessoa pessoa = pessoaMapper.toUpdate(id, atualizacoes);
        Pessoa atualizada = atualizarPessoaUseCase.execute(pessoa);
        return pessoaMapper.toResponse(atualizada);
    }

    @Override
    public void deletar(Long id) {
        Pessoa pessoa = buscarPessoaUseCase.execute(id);
        deletarPessoaUseCase.execute(pessoa);
    }

}