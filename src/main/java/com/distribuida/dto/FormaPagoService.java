package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.FormaPago;

public interface FormaPagoService {
	
	public List<FormaPago> findAll();
	
	public FormaPago findOne(int id);
	
	public void add(int idFormaPago, String formaspago, String descripcion);
	
	public void up(int idFormaPago, String formaspago, String descripcion);
	
	public void del(int id);

	public List<FormaPago> findAll(String busqueda);
}
