package com.desafio_pessoas02.Pessoa02.service.implementacoes;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PessoaEntityServiceImplTest {

//    @InjectMocks
//    PessoaServiceImpl service;
//
//    @Mock
//    PessoaRepository repository;
//
//    @Mock
//    private EnderecoServiceImp enderecoService;
//
//
//    @Test
//    @DisplayName("Deve cadastrar uma nova pessoa com sucesso.")
//    void criar() {
//        PessoaEntity pessoaEntity = PessoaFixture.entity();
//        PessoaRequest dto= PessoaFixture.request(pessoaEntity);
//        List<EnderecoEntity> enderecos = List.of(pessoaEntity.getEnderecoEntities().getFirst());
//
//        when(repository.save(any(PessoaEntity.class))).thenReturn(pessoaEntity);
//        when(enderecoService.criar(dto.enderecos(), pessoaEntity)).thenReturn(enderecos);
//
//        PessoaResponse resposta = service.criar(dto);
//
//        assertNotNull(resposta.id());
//        assertEquals(dto.nome(),resposta.nome());
//        assertEquals(dto.cpf(),resposta.cpf());
//        assertEquals(dto.dataDeNascimento(),resposta.dataDeNascimento());
//        assertEquals(dto.enderecos().size(),resposta.enderecos().size());
//
//    }
//
//    @Test
//    @DisplayName("Deve listar todas as pessoas com sucesso.")
//    void listar() {
//        List<PessoaEntity> pessoaEntities = List.of(PessoaFixture.entity(), PessoaFixture.entity(), PessoaFixture.entity());
//        Pageable pageable = PageRequest.of(0,15);
//        Page<PessoaEntity> pagePessoas = new PageImpl<>(pessoaEntities,pageable, pessoaEntities.size());
//
//        when(repository.findAll(any(Pageable.class))).thenReturn(pagePessoas);
//
//        Page<PessoaResponse> resposta = service.listar(pageable);
//
//        assertEquals(3,resposta.getContent().size());
//        verify(repository).findAll(pageable);
//    }
//
//    @Test
//    @DisplayName("Deve atualizar dados da pessoa com sucesso.")
//    void atualizar() {
//        PessoaEntity pessoaEntity = PessoaFixture.entity();
//        PessoaAtualizada atualizacoesDto = new PessoaAtualizada("maria",null,"888.444.222-77",
//        null);
//
//        when(repository.findById(pessoaEntity.getId())).thenReturn(Optional.of(pessoaEntity));
//        when(repository.save(any(PessoaEntity.class))).thenReturn(pessoaEntity);
//
//        PessoaResponse resposta = service.atualizar(pessoaEntity.getId(), atualizacoesDto);
//
//        assertNotNull(resposta.id());
//        assertEquals(atualizacoesDto.nome(),resposta.nome());
//        assertEquals(pessoaEntity.getDataDeNascimento(),resposta.dataDeNascimento());
//        assertEquals(atualizacoesDto.cpf(),resposta.cpf());
//        assertEquals(pessoaEntity.getEnderecoEntities().size(), resposta.enderecos().size());
//
//    }
//
//    @Test
//    @DisplayName("Deve mostrar idade da pessoa na resposta.")
//    void mostrarIdade() {
//        PessoaEntity pessoaEntity = PessoaFixture.entity();
//        int idade = Period.between(pessoaEntity.getDataDeNascimento(), java.time.LocalDate.now()).getYears();
//        when(repository.findById(pessoaEntity.getId())).thenReturn(Optional.of(pessoaEntity));
//
//        PessoaIdadeResponse resposta = service.mostrarIdade(pessoaEntity.getId());
//
//        assertEquals(idade, resposta.idade());
//
//    }
//
//    @Test
//    @DisplayName("Deve apagar uma pessoa.")
//    void apagar() {
//        PessoaEntity pessoaEntity = PessoaFixture.entity();
//        Long id = pessoaEntity.getId();
//
//        when(repository.findById(id)).thenReturn(Optional.of(pessoaEntity));
//
//        service.apagar(id);
//
//        verify(repository).delete(pessoaEntity);
//    }

}