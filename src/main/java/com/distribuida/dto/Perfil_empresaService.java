package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.Perfil_empresa;



public interface Perfil_empresaService {

	
	public List<Perfil_empresa> finAll();
	
	public Perfil_empresa finOne(int id);
	
	public void add(int idPerfilEmpresa, String logo, String opcColor1, String opcColor2, String gamaColor, int fk_idEmpresa);
	
	public void up(int idPerfilEmpresa, String logo, String opcColor1, String opcColor2, String gamaColor, int fk_idEmpresa);
	
	public void del(int id);
	
	public List<Perfil_empresa> findAll(String busqueda);

}
