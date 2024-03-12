package com.distribuida.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name = "reportes")
public class Reportes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idReporte")
	private int idReporte;
	@Column(name = "reporte")
	private String reporte;
	@Column(name = "fechaReporte")
	private Date fechaReporte;
	@Column(name = "descripcion")
	private String descripcion;
	
	
	public Reportes() {
		
	}
	
	public Reportes(int idReporte, String reporte, Date fechaReporte, String descripcion) {
		this.idReporte = idReporte;
		this.reporte = reporte;
		this.fechaReporte = fechaReporte;
		this.descripcion = descripcion;
	}
	
	public int getIdReporte() {
		return idReporte;
	}
	public void setIdReporte(int idReporte) {
		this.idReporte = idReporte;
	}
	public String getReporte() {
		return reporte;
	}
	
	public void setReporte(String reporte) {
		this.reporte = reporte;
	}

	public Date getFechaReporte() {
		return fechaReporte;
	}
	public void setFechaReporte(Date fechaReporte) {
		this.fechaReporte = fechaReporte;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	@Override
	public String toString() {
		return "Reportes [idReporte=" + idReporte + ", Reporte=" + reporte + ", fechaReporte=" + fechaReporte
				+ ", descripcion=" + descripcion + "]";
	}
}
