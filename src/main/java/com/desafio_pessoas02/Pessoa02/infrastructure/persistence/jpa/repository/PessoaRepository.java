package com.desafio_pessoas02.Pessoa02.infrastructure.persistence.jpa.repository;

import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.jpa.model.EnderecoModel;
import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.jpa.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaModel,Long> {
    @Query("""
        SELECT e
        FROM PessoaModel p
        JOIN p.enderecos e
        WHERE p.id = :pessoaId
        AND e.enderecoPrincipal = true
    """)
    Optional<EnderecoModel> findEnderecoPrincipal(@Param("pessoaId") Long pessoaId);
}
