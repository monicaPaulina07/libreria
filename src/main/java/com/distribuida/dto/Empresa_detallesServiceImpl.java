package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.EmpresaDAO;
import com.distribuida.dao.Empresa_detallesDAO;
import com.distribuida.dao.SucursalesDAO;
import com.distribuida.entities.Empresa;
import com.distribuida.entities.Empresa_detalles;
import com.distribuida.entities.Sucursales;

@Service
public class Empresa_detallesServiceImpl implements Empresa_detallesService {

	@Autowired
	private Empresa_detallesDAO empresa_detallesDAO;
	@Autowired
	private EmpresaDAO empresaDAO;
	@Autowired
	private SucursalesDAO sucursalesDAO;
	
	@Override
	public List<Empresa_detalles> finAll() {
		// TODO Auto-generated method stub
		return empresa_detallesDAO.findAll();
	}

	@Override
	public Empresa_detalles finOne(int id) {
		// TODO Auto-generated method stub
		return empresa_detallesDAO.findOne(id);
	}

	@Override
	public void add(int idDetalleEmpresa, Date fechaInicio, String tipoEmpresa, double encuestapopularidad,
			String comentarios, String horariosAtencion, String chatUsuario, String chatCliente, int fk_idEmpresa,
			int fk_idSucursal) {
		// TODO Auto-generated method stub
		Empresa empresa = empresaDAO.findOne(fk_idEmpresa);
		Sucursales sucursales = sucursalesDAO.findOne(fk_idSucursal);
		
		Empresa_detalles empresa_detalles = new Empresa_detalles(idDetalleEmpresa, fechaInicio, tipoEmpresa, encuestapopularidad,comentarios, horariosAtencion, chatUsuario, chatCliente);
		
		empresa_detalles.setEmpresa(empresa);
		empresa_detalles.setSucursales(sucursales);
		
		
		empresa_detallesDAO.add(empresa_detalles);
		
	}

	@Override
	public void up(int idDetalleEmpresa, Date fechaInicio, String tipoEmpresa, double encuestapopularidad,
			String comentarios, String horariosAtencion, String chatUsuario, String chatCliente, int fk_idEmpresa,
			int fk_idSucursal) {
		// TODO Auto-generated method stub
		Empresa empresa = empresaDAO.findOne(fk_idEmpresa);
		Sucursales sucursales = sucursalesDAO.findOne(fk_idSucursal);
		
		Empresa_detalles empresa_detalles = new Empresa_detalles(idDetalleEmpresa, fechaInicio, tipoEmpresa, encuestapopularidad,comentarios, horariosAtencion, chatUsuario, chatCliente);
		
		empresa_detalles.setEmpresa(empresa);
		empresa_detalles.setSucursales(sucursales);
		
		
		empresa_detallesDAO.up(empresa_detalles);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		empresa_detallesDAO.del(id);
	}

	@Override
	public List<Empresa_detalles> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return empresa_detallesDAO.findAll(busqueda);
	}
	
	

}
