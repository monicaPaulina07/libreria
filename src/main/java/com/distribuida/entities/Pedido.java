package com.distribuida.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "pedidos")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPedido")
	private int idPedido;
	@Column(name = "numeroPedido")
	private String numPedido;
	@Column(name = "fechaPedido")
	private Date fechapedido;
	@Column(name = "confirmacionPedido")
	private int confirmacionPedido;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="fk_idCliente")
	private Cliente cliente;
	public Pedido() {}

	
	public Pedido(int idPedido, String numPedido, Date fechapedido, int confirmacionPedido) {

		this.idPedido = idPedido;
		this.numPedido = numPedido;
		this.fechapedido = fechapedido;
		this.confirmacionPedido = confirmacionPedido;
	}



	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(String numPedido) {
		this.numPedido = numPedido;
	}

	public Date getFechapedido() {
		return fechapedido;
	}

	public void setFechapedido(Date fechapedido) {
		this.fechapedido = fechapedido;
	}

	public int getConfirmacionPedido() {
		return confirmacionPedido;
	}

	public void setConfirmacionPedido(int confirmacionPedido) {
		this.confirmacionPedido = confirmacionPedido;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", numPedido=" + numPedido + ", fechapedido=" + fechapedido
				+ ", confirmacionPedido=" + confirmacionPedido + "]";
	}
	
	
	
}