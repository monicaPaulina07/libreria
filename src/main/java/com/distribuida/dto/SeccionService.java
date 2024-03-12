package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.Seccion;

public interface SeccionService {
	
public List<Seccion> findAll();
	
	public Seccion findOne(int id);
	
	public void add(int idSeccion, String seccion, String descripcion);
	
	public void up(int idSeccion, String seccion, String descripcion);
	
	public void del(int id);
	
	public List<Seccion> findAll(String busqueda);


}
