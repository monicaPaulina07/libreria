package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.PedidoDAO;
import com.distribuida.entities.Pedido;
@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	private PedidoDAO pedidoDAO;
	@Override
	public List<Pedido> findAll() {
		// TODO Auto-generated method stub
		return pedidoDAO.findAll();
	}

	@Override
	public Pedido findOne(int id) {
		// TODO Auto-generated method stub
		return pedidoDAO.findOne(id);
	}

	@Override
	public void add(int idPedido, String numPedido, Date fechapedido, int confirmacionPedido) {
		// TODO Auto-generated method stub
		Pedido pedido = new Pedido (idPedido, numPedido, fechapedido, confirmacionPedido);
		pedidoDAO.add(pedido);
	}

	@Override
	public void up(int idPedido, String numPedido, Date fechapedido, int confirmacionPedido) {
		// TODO Auto-generated method stub
		Pedido pedido = new Pedido (idPedido, numPedido, fechapedido, confirmacionPedido);
		pedidoDAO.up(pedido);	
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		pedidoDAO.del(id);
	}

	@Override
	public List<Pedido> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}



}
