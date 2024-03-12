package com.distribuida.dao;

import java.util.List;


import com.distribuida.entities.Empresa_producto;

public interface Empresa_productoDAO {

public List<Empresa_producto> findAll();
	
	public Empresa_producto findOne(int id);
	
	public void add(Empresa_producto empresa_producto);
	
	public void up(Empresa_producto empresa_producto);
	
	public void del(int id);
	
	public List<Empresa_producto> findAll(String busqueda);
}
