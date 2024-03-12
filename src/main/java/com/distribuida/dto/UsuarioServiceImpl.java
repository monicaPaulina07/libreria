package com.distribuida.dto;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.dao.UsuarioDAO;
import com.distribuida.entities.Usuario;

@Repository
public class UsuarioServiceImpl implements UsuarioService {

	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Override	
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return usuarioDAO.findAll();		
	}

	@Override	
	public Usuario findOne(int id) {
		// TODO Auto-generated method stu
		return usuarioDAO.findOne(id);
	}

	@Override
	public void add(Usuario usuario) {
		// TODO Auto-generated method stub		
		usuarioDAO.add(usuario);
	}

	@Override
	public void up(Usuario usuario) {
		// TODO Auto-generated method stub
		usuarioDAO.up(usuario);
	}

	@Override	
	public void del(int id) {
		// TODO Auto-generated method stub
		usuarioDAO.del(id);
	}

}
