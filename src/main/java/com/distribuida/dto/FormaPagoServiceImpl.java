package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.FormaPagoDAO;
import com.distribuida.entities.FormaPago;

@Service
public class FormaPagoServiceImpl implements FormaPagoService {
	
  @Autowired
	private FormaPagoDAO formaPagoDAO;  
	@Override
	public List<FormaPago> findAll() {
		// TODO Auto-generated method stub
		return formaPagoDAO.findAll();
	}

	@Override
	public FormaPago findOne(int id) {
		// TODO Auto-generated method stub
		return formaPagoDAO.findOne(id);
	}

	@Override
	public void add(int idFormaPago, String formaspago, String descripcion) {
		// TODO Auto-generated method stub
		FormaPago formapago = new FormaPago(idFormaPago, formaspago, descripcion);
		formaPagoDAO.add(formapago);
	}

	@Override
	public void up(int idFormaPago, String formaspago, String descripcion) {
		// TODO Auto-generated method stub
		FormaPago formapago = new FormaPago(idFormaPago, formaspago, descripcion);
		formaPagoDAO.up(formapago);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		formaPagoDAO.del(id);
	}

	@Override
	public List<FormaPago> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return formaPagoDAO.findAll(busqueda);
	}
	
	}
