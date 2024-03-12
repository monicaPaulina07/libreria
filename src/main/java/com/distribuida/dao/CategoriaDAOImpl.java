package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Categoria;


@Repository
public class CategoriaDAOImpl implements CategoriaDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	@Transactional
	public List<Categoria> findAll() {
		Session session =sessionFactory.getCurrentSession();
		
		return session.createQuery("from Categoria",Categoria.class).getResultList();
	}

	@Override
	@Transactional
	public Categoria findOne(int id) {
		//Buscando el primer valor
		Session session = sessionFactory.getCurrentSession();
		return session.get(Categoria.class, id);
	}

	@Override
	@Transactional
	public void add(Categoria categoria) {
		Session session = sessionFactory.getCurrentSession();
		//ADD 0
		// Cliente cliente = new cliente(0,"1566464","nombre","apellido","direccion","tele","correo");
		session.saveOrUpdate(categoria);	

	}
	
	@Override
	@Transactional
	public void up(Categoria categoria) {
		//UPDATE 1
		Session session = sessionFactory.getCurrentSession();//
	
		session.saveOrUpdate(categoria);

	}

	@Override
	@Transactional
	public void del(int id) {
		Session session = sessionFactory.getCurrentSession();//
		session.delete(findOne(id));

	}

	@Override
	@Transactional
	public List<Categoria> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}

}
