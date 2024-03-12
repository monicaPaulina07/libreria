package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Seccion;

public interface SeccionDAO {
	
	public List<Seccion> findAll();
	public  Seccion findOne(int id );
	public  void add (Seccion seccion);
	public  void up (Seccion seccion );	
	public  void del (int id );
	public List<Seccion> findAll(String busqueda);

}
