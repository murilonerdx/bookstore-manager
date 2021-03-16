package com.murilo.cursomc.model.cidade.repository;

import com.murilo.cursomc.model.cidade.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
