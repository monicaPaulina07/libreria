package com.distribuida.dto;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.EmpresaDAO;
import com.distribuida.dao.Perfil_empresaDAO;
import com.distribuida.entities.Empresa;
import com.distribuida.entities.Perfil_empresa;

@Service
public class Perfil_empresaServiceImpl implements Perfil_empresaService {

	@Autowired
	private Perfil_empresaDAO perfil_empresaDAO; 
	
	@Autowired
	private EmpresaDAO empresaDAO; 
	
	@Override	
	public List<Perfil_empresa> finAll() {
		// TODO Auto-generated method stub
		return perfil_empresaDAO.findAll();
	}

	@Override	
	public Perfil_empresa finOne(int id) {
		// TODO Auto-generated method stub
		return perfil_empresaDAO.findOne(id);
	}

	@Override	
	public void add(int idPerfilEmpresa, String logo, String opcColor1, String opcColor2, String gamaColor, int fk_idEmpresa) {
		// TODO Auto-generated method stub
		
		Empresa empresa = empresaDAO.findOne(fk_idEmpresa);
		Perfil_empresa perfil_empresa = new Perfil_empresa(idPerfilEmpresa, logo, opcColor1, opcColor2, gamaColor);
		perfil_empresa.setEmpresa(empresa);
		perfil_empresaDAO.add(perfil_empresa);
	}

	@Override
	public void up(int idPerfilEmpresa, String logo, String opcColor1, String opcColor2, String gamaColor, int fk_idEmpresa) {
		// TODO Auto-generated method stub
		Empresa empresa = empresaDAO.findOne(fk_idEmpresa);
		Perfil_empresa perfil_empresa = new Perfil_empresa(idPerfilEmpresa, logo, opcColor1, opcColor2, gamaColor);
		perfil_empresa.setEmpresa(empresa);
		perfil_empresaDAO.up(perfil_empresa);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		perfil_empresaDAO.del(id);
	}

	@Override	
	public List<Perfil_empresa> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return perfil_empresaDAO.findAll(busqueda);
	}
	

}
