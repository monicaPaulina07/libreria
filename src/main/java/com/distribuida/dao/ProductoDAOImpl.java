package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.distribuida.entities.Producto;
@Repository
public class ProductoDAOImpl implements ProductoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	@Transactional
	public List<Producto> findAll() {
	Session session =sessionFactory.getCurrentSession();
		
		return session.createQuery("from Producto",Producto.class).getResultList();
		
	}

	@Override
	@Transactional
	public Producto findOne(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Producto.class, id);
	}

	@Override
	@Transactional
	public void add(Producto producto) {
		Session session = sessionFactory.getCurrentSession();
		//ADD 0
		// Cliente cliente = new cliente(0,"1566464","nombre","apellido","direccion","tele","correo");
		session.saveOrUpdate(producto);	

	}
	
	@Override
	@Transactional
	public void up(Producto producto) {
		Session session = sessionFactory.getCurrentSession();//
		
		session.saveOrUpdate(producto);

	}

	@Override
	@Transactional
	public void del(int id) {
		Session session = sessionFactory.getCurrentSession();//
		session.delete(findOne(id));

	}

}
