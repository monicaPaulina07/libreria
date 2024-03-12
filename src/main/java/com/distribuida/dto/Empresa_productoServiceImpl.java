package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.EmpresaDAO;
import com.distribuida.dao.Empresa_productoDAO;
import com.distribuida.dao.ProductoDAO;
import com.distribuida.entities.Empresa;
import com.distribuida.entities.Empresa_producto;
//import com.distribuida.entities.Producto;
import com.distribuida.entities.Producto;




@Service
public class Empresa_productoServiceImpl implements Empresa_productoService {
	
	@Autowired
	private Empresa_productoDAO empresa_productoDAO;
	
	@Autowired 
	private EmpresaDAO empresaDAO;
	
	@Autowired
	private ProductoDAO productoDAO;

	@Override
	public List<Empresa_producto> finAll() {
		// TODO Auto-generated method stub
		return empresa_productoDAO.findAll();
	}

	@Override
	public Empresa_producto finOne(int id) {
		// TODO Auto-generated method stub
		return empresa_productoDAO.findOne(id);
	}

	@Override
	public void add(int idempresa_producto, String producto, String descripcion, int fk_idEmpresa, int fk_idProduct) {
		// TODO Auto-generated method stub
		Empresa empresa = empresaDAO.findOne(fk_idEmpresa);
		Producto productoA = productoDAO.findOne(fk_idProduct);
		
		Empresa_producto empresa_producto = new Empresa_producto(idempresa_producto, producto, descripcion);
		
		empresa_producto.setIdempresa(empresa);
		empresa_producto.setIdproducto(productoA);
		empresa_productoDAO.add(empresa_producto);
	}

	@Override
	public void up(int idempresa_producto, String producto, String descripcion, int fk_idEmpresa, int fk_idProductl) {
		// TODO Auto-generated method stub
		Empresa empresa = empresaDAO.findOne(fk_idEmpresa);
		Producto productoA = productoDAO.findOne(fk_idProductl);
		
		Empresa_producto empresa_producto = new Empresa_producto(idempresa_producto, producto, descripcion);
		
		empresa_producto.setIdproducto(productoA);
		empresa_producto.setIdempresa(empresa);
		empresa_productoDAO.up(empresa_producto);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		empresa_productoDAO.del(id);
	}

	@Override
	public List<Empresa_producto> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return empresa_productoDAO.findAll(busqueda);
	}

	
	
}
