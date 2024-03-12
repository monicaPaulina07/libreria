package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;


@Service
public class CategoroaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaDAO CategoriaDAO;
	
	@Override
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return CategoriaDAO.findAll();
	}

	@Override
	public Categoria findOne(int id) {
		// TODO Auto-generated method stub
		return CategoriaDAO.findOne(id);
	}

	@Override
	public void add(int idCategoria, String categoria, String descripcion) {
		// TODO Auto-generated method stub
		Categoria Categoria = new Categoria(idCategoria, categoria, descripcion);
		CategoriaDAO.add(Categoria);
	}

	@Override
	public void up(int idCategoria, String categoria, String descripcion) {
		// TODO Auto-generated method stub
		Categoria Categoria = new Categoria(idCategoria, categoria, descripcion);
		CategoriaDAO.up(Categoria);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		CategoriaDAO.del(id);
	}

	@Override
	public List<Categoria> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return null; //CategoriaDAO.findAll(busqueda);
	}

}
