package com.distribuida.dao;

import java.util.List;


import com.distribuida.entities.Reportes;

public interface ReportesDAO {

	
	public List<Reportes> findAll();
	
	public Reportes findOne(int id);
	
	public void add(Reportes reportes);
	
	public void up(Reportes reportes);
	
	public void del(int id);
	
	public List<Reportes> findAll(String busqueda);
}
