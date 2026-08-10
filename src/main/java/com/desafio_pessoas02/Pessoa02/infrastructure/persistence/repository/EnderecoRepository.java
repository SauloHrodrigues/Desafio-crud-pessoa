package com.desafio_pessoas02.Pessoa02.infrastructure.persistence.repository;

import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.model.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<EnderecoModel,Long> {
}
