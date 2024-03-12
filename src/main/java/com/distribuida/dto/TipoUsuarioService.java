package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.TipoUsuario;

public interface TipoUsuarioService {

	public List<TipoUsuario> findAll();
	
	public TipoUsuario findOne(int id);
	
	public void add(TipoUsuario TipoUsuario);
	
	public void up(TipoUsuario TipoUsuario);
	
	public void del(int id);
}

	
	


