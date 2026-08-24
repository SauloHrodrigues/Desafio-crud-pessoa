package com.desafio_pessoas02.Pessoa02.service.implementacoes;

import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class EnderecoEntityServiceImpTest {

//    @InjectMocks
//    private EnderecoServiceImp service;
//
//    @Mock
//    private EnderecoRepository repository;
//
//
//    @Test
//    @DisplayName("Deve cadastrar um Endereços com sucesso.")
//    void testCriar() {
//        PessoaEntity pessoaEntity = PessoaFixture.entity();
//        EnderecoEntity enderecoEntity = EnderecoFixture.entity();
//
//        when(repository.save(any(EnderecoEntity.class))).thenReturn(enderecoEntity);
//
//        EnderecoEntity resposta = service.criar(enderecoEntity, pessoaEntity);
//
//        assertNotNull(resposta);
//        assertEquals(resposta.getPessoaEntity().getNome(), pessoaEntity.getNome());
//    }
//
//    @Test
//    @DisplayName("Deve cadastrar uma lista de Endereços com sucesso.")
//    void criarListaDeEnderecos() {
//        PessoaEntity pessoaEntity = PessoaFixture.entity();
//        List<EnderecoRequest> enderecoRequests = List.of(EnderecoFixture.request(), EnderecoFixture.request());
//
//        when(repository.save(any(EnderecoEntity.class))).thenAnswer(invocation -> invocation.getArgument(0));
//
//        List<EnderecoEntity> resposta = service.criar(enderecoRequests, pessoaEntity);
//
//        ArgumentCaptor<EnderecoEntity> captor = ArgumentCaptor.forClass(EnderecoEntity.class);
//
//        assertNotNull(resposta);
//        assertEquals(resposta.size(),enderecoRequests.size());
//        assertThat(resposta).hasSize(2);
//        assertThat(resposta.get(0).getPessoaEntity()).isNotNull();
//        assertThat(resposta.get(1).getPessoaEntity()).isNotNull();
//        verify(repository, times(2)).save(captor.capture());
//    }
//
//
//    @Test
//    @DisplayName("Deve atualizar um Endereço com sucesso.")
//    void atualiza() {
//        EnderecoEntity enderecoEntity = EnderecoFixture.entity();
//        EnderecoAtualizado atualizacoes = new EnderecoAtualizado(enderecoEntity.getId(), "Avenida Paulista",
//                null,"Penha",null,"SE","13222666",false );
//        List<EnderecoAtualizado> enderecoAtualizados = List.of(atualizacoes);
//
//        when(repository.findById(enderecoEntity.getId())).thenReturn(Optional.of(enderecoEntity));
//
//        service.atualiza(enderecoAtualizados);
//
//      verify(repository).save(enderecoEntity);
//
//    }
//
//
//    @Test
//    @DisplayName("Deve apagar um endereco.")
//    void apagar() {
//        EnderecoEntity enderecoEntity = EnderecoFixture.entity();
//        Long id = enderecoEntity.getId();
//        List<EnderecoEntity> enderecos = List.of(enderecoEntity);
//
//        service.apagar(enderecos);
//
//        verify(repository).delete(enderecoEntity);
//    }
//
//    @Test
//    @DisplayName("Deve validar que a lista de enderecos request não é vazia.")
//    void deveValidaListaNaoVazia() {
//        EnderecoRequest request = EnderecoFixture.request();
//        List<EnderecoRequest> enderecoRequests = List.of(request);
//
//        assertDoesNotThrow(() -> service.validaLista(enderecoRequests));
//
//    }
//
//    @Test
//    @DisplayName("Deve Lancar Excecao de lista de enderecos request vazia.")
//    void deveLancarExcecaoDeListaVazia() {
//        EnderecoRequest request = EnderecoFixture.request();
//        List<EnderecoRequest> enderecoRequests = new ArrayList<>();
//
//        ListaVaziaException excecao = assertThrows(ListaVaziaException.class,
//                ()-> service.validaLista(enderecoRequests));
//
//        assertEquals("Lista vazia",excecao.getMessage());
//
//    }
//
//    @Test
//    @DisplayName("Deve buscar um enderco pelo id no banco.")
//    void buscar() {
//        EnderecoEntity enderecoEntity = EnderecoFixture.entity();
//        Long id = enderecoEntity.getId();
//
//        when(repository.findById(id)).thenReturn(Optional.of(enderecoEntity));
//
//        EnderecoEntity resposta = service.buscar(id);
//
//        assertEquals(enderecoEntity.getId(),resposta.getId());
//        assertEquals(enderecoEntity.getRua(),resposta.getRua());
//        assertEquals(enderecoEntity.getNumero(),resposta.getNumero());
//        assertEquals(enderecoEntity.getCep(),resposta.getCep());
//        assertEquals(enderecoEntity.getBairro(),resposta.getBairro());
//        assertEquals(enderecoEntity.getCidade(),resposta.getCidade());
//        assertEquals(enderecoEntity.getEstado(),resposta.getEstado());
//    }
}