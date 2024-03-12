package com.distribuida.dto;


import java.util.List;

import com.distribuida.entities.Empresa;


public interface EmpresaService {
	
	public List<Empresa> finAll();

	public Empresa finOne(int id);
	
	public void add(int idEmpresa, String cirPago, String nombreempresa, String personaCargoEmpresa,
	        String personaContacto, String telefono, String correo, String direccion);
	
	public void up(int idEmpresa, String cirPago, String nombreempresa, String personaCargoEmpresa,
	        String personaContacto, String telefono, String correo, String direccion);
	
	public void del(int id);
	
	public List<Empresa> findAll(String busqueda);
}
