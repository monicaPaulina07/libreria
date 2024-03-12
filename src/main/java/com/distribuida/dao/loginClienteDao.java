package com.distribuida.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.loginCliente;

public interface loginClienteDao {

 
	public List<loginCliente> findAll();
		
		public loginCliente findOne(int id);
		
		public void add(loginCliente loginCliente);
		
		public void up(loginCliente loginCliente);
		
		public void del(int id);

		
		
	
		
		
	}

