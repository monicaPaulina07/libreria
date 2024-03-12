package com.distribuida.dto;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.EmpresaDAO;
import com.distribuida.entities.Empresa;


@Service
public class EmpresaServiceImpl implements EmpresaService {

	@Autowired
	private EmpresaDAO empresaDAO;
	
	@Override
	public List<Empresa> finAll() {
		// TODO Auto-generated method stub
		return empresaDAO.findAll();
	}

	@Override
	public Empresa finOne(int id) {
		// TODO Auto-generated method stub
		return empresaDAO.findOne(id);
	}

	@Override
	public void add(int idEmpresa, String cirPago, String nombreempresa, String personaCargoEmpresa,
			String personaContacto, String telefono, String correo, String direccion) {
		// TODO Auto-generated method stub
		Empresa empresa = new Empresa(idEmpresa, cirPago, nombreempresa, personaCargoEmpresa,
			personaContacto, telefono, correo, direccion);
		empresaDAO.add(empresa);
	}

	@Override
	public void up(int idEmpresa, String cirPago, String nombreempresa, String personaCargoEmpresa,
			String personaContacto, String telefono, String correo, String direccion) {
		// TODO Auto-generated method stub
		Empresa empresa = new Empresa(idEmpresa, cirPago, nombreempresa, personaCargoEmpresa,
				personaContacto, telefono, correo, direccion);
			empresaDAO.up(empresa);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		empresaDAO.del(id);
	}

	@Override
	public List<Empresa> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return empresaDAO.findAll(busqueda);
	}

}
