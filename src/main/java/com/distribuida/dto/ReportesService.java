package com.distribuida.dto;

import java.sql.Date;
import java.util.List;

import com.distribuida.entities.Reportes;



public interface ReportesService {

	public List<Reportes> finAll();

	public Reportes finOne(int id);
	
	public void add(int idReporte, String reporte, Date fechaReporte, String descripcion);
	
	public void up(int idReporte, String reporte, Date fechaReporte, String descripcion);
	
	public void del(int id);
	
	public List<Reportes> findAll(String busqueda);
}
