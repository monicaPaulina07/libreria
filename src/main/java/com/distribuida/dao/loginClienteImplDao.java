package com.distribuida.dao;
import java.util.List;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Seccion;
import com.distribuida.entities.loginCliente;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class loginClienteImplDao implements loginClienteDao {
	
	
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<loginCliente> findAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from loginCliente", loginCliente.class).getResultList();
		
	}

	@Override
	@Transactional
	public loginCliente findOne(int id) {
	Session session = sessionFactory.getCurrentSession();
		
		return session.get(loginCliente.class, id);
	}

	@Override
	@Transactional
	public void add(loginCliente logincliente) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		//cliente cliente1 = new cliente();
		//Actulizar
		//cliente cliente2 = new cliente();
		session.saveOrUpdate(logincliente);
		
	}
	


	@Override
	@Transactional
	public void up(loginCliente logincliente) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(logincliente);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
				Session session = sessionFactory.getCurrentSession();
				session.delete(findOne(id));		
	}
	
	

	



	


	

 
}


