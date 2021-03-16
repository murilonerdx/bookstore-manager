package com.murilo.cursomc.model.pedido.repository;

import com.murilo.cursomc.model.itemPedido.entity.ItemPedido;
import com.murilo.cursomc.model.pedido.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
