package com.murilo.cursomc.model.pagamento.entity;

import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.murilo.cursomc.model.pagamento.enums.EstadoPagamento;
import com.murilo.cursomc.model.pedido.entity.Pedido;

@Entity
@JsonTypeName("pagamentoComBoleto")
public class PagamentoComBoleto extends Pagamento{

	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataVencimento;

	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataPagamento;


	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
	}

	public PagamentoComBoleto() {

	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}


}
