package com.murilo.cursomc.model.endereco.repository;

import com.murilo.cursomc.model.endereco.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
