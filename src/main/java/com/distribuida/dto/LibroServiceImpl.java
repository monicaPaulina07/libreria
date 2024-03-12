package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;


@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroDAO libroDAO;
	
	@Autowired
	private AutorDAO autorDAO;
	
	@Autowired
	private CategoriaDAO categoriaDAO;
	
	
	@Override
	public List<Libro> findAll() {
		// TODO Auto-generated method stub
		return libroDAO.findAll();
	}

	@Override
	public Libro findOne(int id) {
		// TODO Auto-generated method stub
		return libroDAO.findOne(id);
	}

	@Override
	public void add(int idLibro, String titulo, String editorial, Integer numPaginas, String edicion, String idioma,
			Date fechaPublicacion, String descripcion, String tipoPasta, String iSBN, int numEjemplares, String portada,
			String presentacion, Double precio, Integer idAutor, int idCategoria) {
		// TODO Auto-generated method stub
		Autor autor = autorDAO.findOne(idAutor);
		Categoria categoria = categoriaDAO.findOne(idCategoria);
		
		Libro libro = new Libro(idLibro, titulo, editorial, numPaginas, edicion, idioma,
				fechaPublicacion, descripcion, tipoPasta, iSBN, numEjemplares, portada,
				presentacion, precio);
		
		libro.setAutor(autor);
		libro.setCategoria(categoria);
		
		libroDAO.add(libro);
		
	}

	@Override
	public void up(int idLibro, String titulo, String editorial, int numPaginas, String edicion, String idioma,
			Date fechaPublicacion, String descripcion, String tipoPasta, String iSBN, int numEjemplares, String portada,
			String presentacion, Double precio, int idAutor, int idCategoria) {
		// TODO Auto-generated method stub
		Autor autor = autorDAO.findOne(idAutor);
		Categoria categoria = categoriaDAO.findOne(idCategoria);
		
		Libro libro = new Libro(idLibro, titulo, editorial, numPaginas, edicion, idioma,
				fechaPublicacion, descripcion, tipoPasta, iSBN, numEjemplares, portada,
				presentacion, precio);
		
		libro.setAutor(autor);
		libro.setCategoria(categoria);
		
		libroDAO.up(libro);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		libroDAO.del(id);
	}

	@Override
	public List<Libro> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return libroDAO.findAll(busqueda);
	}

}
