package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.Producto;

public interface ProductoService {
	
public List<Producto> finAll();
	
	public Producto finOne(int id);
	
	public void add(int idProducto, String numeroProducto, String descripcion, double precioProducto, int stock,
			String imgProducto, int fk_idCategoria);
	
	public void up(int idProducto, String numeroProducto, String descripcion, double precioProducto, int stock,
			String imgProducto, int fk_idCategoria);
	
	public void del(int id);
	
	public List<Producto> findAll(String busqueda);

}
