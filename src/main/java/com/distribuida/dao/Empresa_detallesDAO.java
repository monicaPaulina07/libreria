package com.distribuida.dao;

import com.distribuida.entities.Empresa_detalles;

import java.util.List;

public interface Empresa_detallesDAO {
	
	//DAO IMPL

	public List<Empresa_detalles> findAll();
	
	public Empresa_detalles findOne(int id);
	
	public void add(Empresa_detalles empresa_detalles);
	
	public void up(Empresa_detalles empresa_detalles);
	
	public void del(int id);

	public List<Empresa_detalles> findAll(String busqueda);
}
