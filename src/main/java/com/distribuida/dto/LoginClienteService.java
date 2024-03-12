package com.distribuida.dto;
 
 
import java.util.Date;
import java.util.List;
 

import com.distribuida.entities.loginCliente;

public interface LoginClienteService {
	
	public List<loginCliente> findAll();
	public loginCliente findOne(int id);
	public void add(int id, String user, String password, String newpassword, String confirmpassword,
			String loginCorreo, String loginToken, Date sessiontimeIn, Date sessiontimeOUT, Integer sessiontiempo);
	
	public void up(int id, String user, String password, String newpassword, String confirmpassword,
			String loginCorreo, String loginToken, Date sessiontimeIn, Date sessiontimeOUT, Integer sessiontiempo);
	
	public void del(int id);
	public List<loginCliente> findAll(String busqueda);
 
}