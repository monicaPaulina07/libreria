package com.distribuida.entities;

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
@Table(name = "perfiles_empresa")
public class Perfil_empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPerfilEmpresa")
	private int idPerfilEmpresa;
	@Column(name = "logo")
	private String logo; 
	@Column(name = "OpcColor1")
	private String OpcColor1;  
	@Column(name = "OpcColor2")
	private String OpcColor2;
	@Column(name = "GamaColor")
	private String GamaColor;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "fk_idEmpresa")
	private Empresa empresa;
	
	public Perfil_empresa() {}
	



	public Perfil_empresa(int idPerfilEmpresa, String logo, String opcColor1, String opcColor2, String gamaColor/*,
			Empresa empresa*/) {

		this.idPerfilEmpresa = idPerfilEmpresa;
		this.logo = logo;
		this.OpcColor1 = opcColor1;
		this.OpcColor2 = opcColor2;
		this.GamaColor = gamaColor;
//		this.empresa = empresa;
	}




	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getOpcColor1() {
		return OpcColor1;
	}
	public void setOpcColor1(String opcColor1) {
		OpcColor1 = opcColor1;
	}
	public String getOpcColor2() {
		return OpcColor2;
	}
	public void setOpcColor2(String opcColor2) {
		OpcColor2 = opcColor2;
	}
	public String getGamaColor() {
		return GamaColor;
	}
	public void setGamaColor(String gamaColor) {
		GamaColor = gamaColor;
	}
	public int getIdPerfilEmpresa() {
		return idPerfilEmpresa;
	}

	public void setIdPerfilEmpresa(int idPerfilEmpresa) {
		this.idPerfilEmpresa = idPerfilEmpresa;
	}
	

	public Empresa getEmpresa() {
		return empresa;
	}


	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


	@Override
	public String toString() {
		return "Perfil_empresa [idPerfilEmpresa=" + idPerfilEmpresa + ", logo=" + logo + ", OpcColor1=" + OpcColor1
				+ ", OpcColor2=" + OpcColor2 + ", GamaColor=" + GamaColor + ", empresa=" + empresa + "]";
	}





}
