package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.Empresa_detalles;

public interface Empresa_detallesService {

	
public List<Empresa_detalles> finAll();
	
	public Empresa_detalles finOne(int id);
	
	public void add(int idDetalleEmpresa, Date fechaInicio, String tipoEmpresa, double encuestapopularidad,
			String comentarios, String horariosAtencion, String chatUsuario, String chatCliente, int fk_idEmpresa,int fk_idSucursal);
	
	public void up(int idDetalleEmpresa, Date fechaInicio, String tipoEmpresa, double encuestapopularidad,
			String comentarios, String horariosAtencion, String chatUsuario, String chatCliente, int fk_idEmpresa,int fk_idSucursal);
	
	public void del(int id);
	
	public List<Empresa_detalles> findAll(String busqueda);
}
