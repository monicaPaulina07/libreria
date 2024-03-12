package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.SeccionDAO;
import com.distribuida.entities.Seccion;

@Service
public class SeccionServiceImpl implements SeccionService {
	
	
	@Autowired 
	private SeccionDAO seccionDAO;

	
	@Override
	public void add(int idSeccion, String seccion, String descripcion) {
		// TODO Auto-generated method stub

		Seccion seccion1 = new Seccion(idSeccion,seccion,descripcion);
		seccionDAO.add(seccion1);
		
	}

	@Override
	public void up(int idSeccion, String seccion, String descripcion) {
		// TODO Auto-generated method stub
		Seccion seccion1 = new Seccion(idSeccion,seccion,descripcion);
		seccionDAO.up(seccion1);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

		seccionDAO.del(id);
	}

	@Override
	public List<Seccion> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return seccionDAO.findAll(busqueda);
	}

	@Override
	public List<Seccion> findAll() {
		// TODO Auto-generated method stub
		return seccionDAO.findAll();
	}

	@Override
	public Seccion findOne(int id) {
		// TODO Auto-generated method stub
		return seccionDAO.findOne(id);
	}

	

}
