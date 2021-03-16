package com.murilo.cursomc.model.itemPedido.repository;

import com.murilo.cursomc.model.itemPedido.entity.ItemPedido;
import com.murilo.cursomc.model.pedido.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
}
