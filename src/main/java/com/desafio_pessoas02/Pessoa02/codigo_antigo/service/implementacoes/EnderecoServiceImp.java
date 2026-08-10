package com.desafio_pessoas02.Pessoa02.codigo_antigo.service.implementacoes;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
//@Service
public class EnderecoServiceImp {

//    private final EnderecoRepository repository;
//    private EnderecoMapper mapper = EnderecoMapper.INSTANCE;
//
//    protected EnderecoEntity criar(EnderecoEntity enderecoEntity, PessoaEntity pessoaEntity) {
//        enderecoEntity.setPessoaEntity(pessoaEntity);
//        return repository.save(enderecoEntity);
//    }
//
//
//    protected List<EnderecoEntity> criar(List<EnderecoRequest> dto, PessoaEntity pessoaEntity){
//        validaLista(dto);
//        List<EnderecoEntity> enderecos = new ArrayList<>();
//        boolean principal= false;
//
//        for(EnderecoRequest request:dto){
//            EnderecoEntity enderecoEntity = mapper.toEntity(request);
//            if(!principal && enderecoEntity.isEnderecoPrincipal()){
//                principal=true;
//            } else {
//                enderecoEntity.setEnderecoPrincipal(false);
//            }
//            enderecos.add(criar(enderecoEntity, pessoaEntity));
//        }
//        return enderecos;
//    }
//
//    protected void atualiza(List<EnderecoAtualizado>atualizacoes){
//        if(atualizacoes == null){
//            return;
//        } else {
//            for(EnderecoAtualizado atualizado:atualizacoes){
//                EnderecoEntity enderecoEntity = buscar(atualizado.id());
//                enderecoEntity = mapper.toUpdade(enderecoEntity,atualizado);
//                repository.save(enderecoEntity);
//            }
//        }
//
//    }
//
//    protected void apagar(List<EnderecoEntity> enderecos){
//        for(EnderecoEntity enderecoEntity : enderecos){
//            repository.delete(enderecoEntity);
//        }
//    }
//
//
//    protected void validaLista(List<EnderecoRequest>dto){
//        if(dto.isEmpty()){
//            throw new ListaVaziaException("Lista vazia");
//        }
//    }
//
//    protected EnderecoEntity buscar(Long id){
//        return repository.findById(id).orElseThrow(
//                ()-> new EnderecoNaoEncontradoException(id)
//        );
//    }
}
