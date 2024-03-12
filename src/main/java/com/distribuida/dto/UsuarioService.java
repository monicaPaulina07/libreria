package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.Usuario;

public interface UsuarioService {

	public List<Usuario> findAll();
	
	public Usuario findOne(int id);
	
	public void add(Usuario usuario);
	
	public void up(Usuario usuario);
	
	public void del(int id);
}

	
	


