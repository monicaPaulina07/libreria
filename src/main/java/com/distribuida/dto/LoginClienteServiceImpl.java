package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.loginClienteDao;
import com.distribuida.dao.loginClienteImplDao;
import com.distribuida.entities.loginCliente;


@Service
public class LoginClienteServiceImpl implements LoginClienteService {

	@Autowired
	private loginClienteDao loginClienteDao;
	
	@Override
	public List<loginCliente> findAll() {
		// TODO Auto-generated method stub
		return loginClienteDao.findAll();
	}

	@Override
	public loginCliente findOne(int id) {
		// TODO Auto-generated method stub
		return loginClienteDao.findOne(id);
	}

	@Override
	public void add(int id, String user, String password, String newpassword, String confirmpassword,
			String loginCorreo, String loginToken, Date sessiontimeIn, Date sessiontimeOUT, Integer sessiontiempo) {
		// TODO Auto-generated method stub
		loginCliente loginCliente1 = new loginCliente(id, user, password, newpassword, confirmpassword,loginCorreo, loginToken, sessiontimeIn,sessiontimeOUT, sessiontiempo);
		
		loginClienteDao.add(loginCliente1);
		
	}

	@Override
	public void up(int id, String user, String password, String newpassword, String confirmpassword,
			String loginCorreo, String loginToken, Date sessiontimeIn, Date sessiontimeOUT, Integer sessiontiempo) {
		// TODO Auto-generated method stub
		loginCliente loginCliente1 = new loginCliente(id, user, password, newpassword, confirmpassword,loginCorreo, loginToken, sessiontimeIn,sessiontimeOUT, sessiontiempo);
		
		loginClienteDao.up(loginCliente1);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		loginClienteDao.del(id);
	}

	@Override
	public List<loginCliente> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}

	
	 
}
