package com.distribuida.dto;
import java.util.List;

import com.distribuida.entities.Categoria;
import com.distribuida.entities.Seccion;

public interface CategoriaService {
	
	public List<Categoria> finAll();
	
	public Categoria finOne(int id);
	
	public void add(int idCategoria, String categoria, String descripcion, int fk_idSeccion);
	
	public void up(int idCategoria, String categoria, String descripcion,int fk_idSeccion);
	
	public void del(int id);
	
	public List<Categoria> findAll(String busqueda);

}
