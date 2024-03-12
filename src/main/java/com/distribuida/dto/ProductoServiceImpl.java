package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.ProductoDAO;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {
	

	@Autowired
	private ProductoDAO productoDAO;
	
	@Autowired
	private CategoriaDAO categoriaDAO;
	
	@Override
	public List<Producto> finAll() {
		// TODO Auto-generated method stub
		return productoDAO.findAll();
	}

	@Override
	public Producto finOne(int id) {
		// TODO Auto-generated method stub
		return productoDAO.findOne(id);
	}

	@Override
	public void add(int idProducto, String numeroProducto, String descripcion, double precioProducto, int stock,
			String imgProducto, int fk_idCategoria) {
		// TODO Auto-generated method stub
		
		Categoria categoria = categoriaDAO.findOne(fk_idCategoria);
		
		Producto producto1 = new Producto(idProducto, numeroProducto, descripcion, precioProducto, stock, imgProducto);
		
		producto1.setCategoria(categoria);
		
		productoDAO.add(producto1);

	}

	@Override
	public void up(int idProducto, String numeroProducto, String descripcion, double precioProducto, int stock,
			String imgProducto, int fk_idCategoria) {
		// TODO Auto-generated method stub
Categoria categoria = categoriaDAO.findOne(fk_idCategoria);
		
		Producto producto1 = new Producto(idProducto,numeroProducto,descripcion,precioProducto,stock,imgProducto);
		
		producto1.setCategoria(categoria);
		
		productoDAO.up(producto1);

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

		productoDAO.del(id);
	}

	@Override
	public List<Producto> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}

}
