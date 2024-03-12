package com.distribuida.dto;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.ReportesDAO;
import com.distribuida.entities.Reportes;


@Service
public class ReportesServiceImpl implements ReportesService {
	@Autowired
	private ReportesDAO reportesDAO;
	
	@Override
	public List<Reportes> finAll() {
		// TODO Auto-generated method stub
		return reportesDAO.findAll();
	}

	@Override
	public Reportes finOne(int id) {
		// TODO Auto-generated method stub
		return reportesDAO.findOne(id);
	}

	@Override
	public void add(int idReporte, String reporte, Date fechaReporte, String descripcion) {
		// TODO Auto-generated method stub
		Reportes reportes = new Reportes(idReporte, reporte, fechaReporte, descripcion);
		reportesDAO.add(reportes);
	}

	@Override
	public void up(int idReporte, String reporte, Date fechaReporte, String descripcion) {
		// TODO Auto-generated method stub
		Reportes reportes = new Reportes(idReporte, reporte, fechaReporte, descripcion);
		reportesDAO.up(reportes);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		reportesDAO.del(id);
	}

	@Override
	public List<Reportes> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return reportesDAO.findAll(busqueda);
	}

	

}
