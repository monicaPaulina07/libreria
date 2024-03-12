package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="tipos_usuario")
public class TipoUsuario {
	


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "idtipoUs")
	private int idtipoUs;
@Column(name = "TipodeUser")
    private String TipodeUser;
@Column(name = "Descripcion")
    private String Descripcion;

public TipoUsuario() {

}

public TipoUsuario(int idtipoUs, String tipodeUser, String descripcion) {
	
	this.idtipoUs = idtipoUs;
	this.TipodeUser = tipodeUser;
	this.Descripcion = descripcion;
}

public int getIdtipoUs() {
	return idtipoUs;
}

public void setIdtipoUs(int idtipoUs) {
	this.idtipoUs = idtipoUs;
}

public String getTipodeUser() {
	return TipodeUser;
}

public void setTipodeUser(String tipodeUser) {
	TipodeUser = tipodeUser;
}

public String getDescripcion() {
	return Descripcion;
}

public void setDescripcion(String descripcion) {
	Descripcion = descripcion;
}

@Override
public String toString() {
	return "TipoUsuario [idtipoUs=" + idtipoUs + ", TipodeUser=" + TipodeUser + ", Descripcion=" + Descripcion + "]";
}




	
	
	

}
