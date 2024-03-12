package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import javax.persistence.CascadeType;

import javax.persistence.ManyToOne;


import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="usuario")
public class Usuario {
	  
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario")
		private int idUsuario;
	@Column(name = "nombre")
	    private String nombre;
	@Column(name = "apellido")
	    private String apellido;
	@Column(name = "fechadenacimiento")
    private String fechadenacimiento;
	@Column(name = "cedula")
    private String cedula;
	@Column(name = "telefono")
    private String telefono;
	@Column(name = "correo")
    private String correo;
	@Column(name = "direccion")
    private String direccion;
	@Column(name = "genero")
    private String genero;
	
	
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "fk_idtipoUs")
	private TipoUsuario tipoUsuario;
	
		
	public Usuario() {

	}
	
	





	public Usuario(int idUsuario, String nombre, String apellido, String fechadenacimiento, String cedula,
			String telefono, String correo, String direccion, String genero, TipoUsuario tipoUsuario) {
	
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechadenacimiento = fechadenacimiento;
		this.cedula = cedula;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.genero = genero;
		this.tipoUsuario = tipoUsuario;
	}












	public int getIdUsuario() {
		return idUsuario;
	}







	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}







	public String getNombre() {
		return nombre;
	}







	public void setNombre(String nombre) {
		this.nombre = nombre;
	}







	public String getApellido() {
		return apellido;
	}







	public void setApellido(String apellido) {
		this.apellido = apellido;
	}







	public String getFechadenacimiento() {
		return fechadenacimiento;
	}







	public void setFechadenacimiento(String fechadenacimiento) {
		this.fechadenacimiento = fechadenacimiento;
	}







	public String getCedula() {
		return cedula;
	}







	public void setCedula(String cedula) {
		this.cedula = cedula;
	}







	public String getTelefono() {
		return telefono;
	}







	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}







	public String getCorreo() {
		return correo;
	}







	public void setCorreo(String correo) {
		this.correo = correo;
	}







	public String getDireccion() {
		return direccion;
	}







	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}







	public String getGenero() {
		return genero;
	}







	public void setGenero(String genero) {
		this.genero = genero;
	}







	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}







	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}







	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechadenacimiento=" + fechadenacimiento + ", cedula=" + cedula + ", telefono=" + telefono
				+ ", correo=" + correo + ", direccion=" + direccion + ", genero=" + genero + ", tipoUsuario="
				+ tipoUsuario + "]";
	}









	
	
	
}
