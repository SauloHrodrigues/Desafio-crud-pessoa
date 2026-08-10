package com.desafio_pessoas02.Pessoa02.codigo_antigo.service.implementacoes;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
//@Service
public class PessoaServiceImpl {//implements PessoaServiceI {
//
//    private final PessoaRepository repository;
//    private final EnderecoServiceImp enderecoService;
//    private PessoaMapper mapper = PessoaMapper.INSTANCE;
//
//    @Transactional
//    @Override
//    public PessoaResponse criar(PessoaRequest dto) {
//        PessoaEntity pessoaEntity = mapper.toEntity(dto);
//        pessoaEntity = repository.save(pessoaEntity);
//
//        List<EnderecoEntity> enderecos = enderecoService.criar(dto.enderecos(), pessoaEntity);
//
//        pessoaEntity.setEnderecoEntities(enderecos);
//
//        return mapper.toResponse(pessoaEntity);
//    }
//
//    @Override
//    public Page<PessoaResponse> listar(Pageable pageable) {
//        Page<PessoaResponse> pessoas = repository.findAll(pageable).map(mapper::toResponse);
//        return pessoas;
//    }
//
//    @Override
//    public PessoaResponse atualizar(Long id, PessoaAtualizada atualizacoes) {
//        PessoaEntity pessoaEntity = buscar(id);
//        enderecoService.atualiza(atualizacoes.enderecos());
//        PessoaEntity pessoaEntityAtualizada = mapper.toUpdade(pessoaEntity,atualizacoes);
//        pessoaEntityAtualizada = repository.save(pessoaEntityAtualizada);
//
//        return mapper.toResponse(pessoaEntityAtualizada);
//    }
//
//    @Override
//    public PessoaIdadeResponse mostrarIdade(Long id) {
//        PessoaEntity pessoaEntity = buscar(id);
//        return mapper.toPessoaIdadeResponse(pessoaEntity);
//    }
//
//    @Override
//    public void apagar(Long id) {
//        PessoaEntity pessoaEntity = buscar(id);
//        enderecoService.apagar(pessoaEntity.getEnderecoEntities());
//        repository.delete(pessoaEntity);
//    }
//
//    protected PessoaEntity buscar(Long id){
//        return repository.findById(id).orElseThrow(
//                ()-> new PessoaNaoEncontradaException(id)
//        );
//    }
}
