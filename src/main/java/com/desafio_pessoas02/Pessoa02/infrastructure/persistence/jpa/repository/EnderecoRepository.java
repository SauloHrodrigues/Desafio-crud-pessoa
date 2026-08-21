package com.desafio_pessoas02.Pessoa02.infrastructure.persistence.jpa.repository;

import com.desafio_pessoas02.Pessoa02.infrastructure.persistence.jpa.model.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<EnderecoModel,Long> {
}
