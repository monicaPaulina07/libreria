package com.distribuida.dto;


import java.util.List;

import com.distribuida.entities.Empresa_producto;




public interface Empresa_productoService {
	
	public List<Empresa_producto> finAll();
	
	public Empresa_producto finOne(int id);
	
	public void add(int idempresa_producto, String producto, String descripcion, int fk_idEmpresa,int fk_idProduct);
	
	public void up(int idempresa_producto, String producto, String descripcion, int fk_idEmpresa,int fk_idProductl);
	
	public void del(int id);
	
	public List<Empresa_producto> findAll(String busqueda);

}
