package com.murilo.cursomc.model.estado.repository;

import com.murilo.cursomc.model.estado.entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
