package com.distribuida.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name = "empresa_detalle")
public class Empresa_detalles {	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDetalleEmpresa")
	private int idDetalleEmpresa;
	@Column(name = "FechaInicio")
	private Date FechaInicio; 
	@Column(name = "tipoEmpresa")
	private String tipoEmpresa;
	@Column(name = "encuestapopularidad")
	private double encuestapopularidad; 
	@Column(name = "Comentarios")
	private String Comentarios;
	@Column(name = "HorariosAtencion")
	private String HorariosAtencion;
	@Column(name = "ChatUsario")
	private String ChatUsuario;
	@Column(name = "ChatCliente")
	private String ChatCliente; 
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "fk_idEmpresa")
	private Empresa empresa;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "fk_idSucursal")
	private Sucursales sucursales;
	
	
	public Empresa_detalles() {	}

	

	public Empresa_detalles(int idDetalleEmpresa, Date fechaInicio, String tipoEmpresa, double encuestapopularidad,
			String comentarios, String horariosAtencion, String chatUsuario, String chatCliente/*, Empresa empresa,
			Sucursales sucursales*/) {
		this.idDetalleEmpresa = idDetalleEmpresa;
		this.FechaInicio = fechaInicio;
		this.tipoEmpresa = tipoEmpresa;
		this.encuestapopularidad = encuestapopularidad;
		this.Comentarios = comentarios;
		this.HorariosAtencion = horariosAtencion;
		this.ChatUsuario = chatUsuario;
		this.ChatCliente = chatCliente;
//		this.empresa = empresa;
//		this.sucursales = sucursales;
	}



	public int getIdDetalleEmpresa() {
		return idDetalleEmpresa;
	}

	public void setIdDetalleEmpresa(int idDetalleEmpresa) {
		this.idDetalleEmpresa = idDetalleEmpresa;
	}

	public Date getFechaInicio() {
		return FechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		FechaInicio = fechaInicio;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	public double getEncuestapopularidad() {
		return encuestapopularidad;
	}

	public void setEncuestapopularidad(double encuestapopularidad) {
		this.encuestapopularidad = encuestapopularidad;
	}

	public String getComentarios() {
		return Comentarios;
	}

	public void setComentarios(String comentarios) {
		Comentarios = comentarios;
	}

	public String getHorariosAtencion() {
		return HorariosAtencion;
	}

	public void setHorariosAtencion(String horariosAtencion) {
		HorariosAtencion = horariosAtencion;
	}

	public String getChatUsuario() {
		return ChatUsuario;
	}

	public void setChatUsuario(String chatUsuario) {
		ChatUsuario = chatUsuario;
	}

	public String getChatCliente() {
		return ChatCliente;
	}

	public void setChatCliente(String chatCliente) {
		ChatCliente = chatCliente;
	}

	public Sucursales getSucursales() {
		return sucursales;
	}

	public void setSucursales(Sucursales sucursales) {
		this.sucursales = sucursales;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Empresa_detalles [idDetalleEmpresa=" + idDetalleEmpresa + ", FechaInicio=" + FechaInicio
				+ ", tipoEmpresa=" + tipoEmpresa + ", encuestapopularidad=" + encuestapopularidad + ", Comentarios="
				+ Comentarios + ", HorariosAtencion=" + HorariosAtencion + ", ChatUsuario=" + ChatUsuario
				+ ", ChatCliente=" + ChatCliente + ", sucursales=" + sucursales + ", empresa=" + empresa + "]";
	}

	
	
	

}
