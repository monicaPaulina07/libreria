package com.distribuida.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Libro;


@Repository
public class LibroDAOImpl implements LibroDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	@Transactional
	public List<Libro> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from Libro", Libro.class).getResultList();
	}

	@Override
	@Transactional
	public Libro findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Libro.class, id);
	}

	@Override
	@Transactional
	public void add(Libro libro) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(libro);
	}

	@Override
	@Transactional
	public void up(Libro libro) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(libro);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

	
	@Override
	@Transactional
	public List<Libro> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<Libro> query = session.createQuery(" select li "
				+ " from Libro li "
				+ " where titulo like : keyBusqueda "
				+ " or editorial like : keyBusqueda "
				+ " or numPaginas like : keyBusqueda "
				+ " or edicion like : keyBusqueda "
				+ " or idioma like : keyBusqueda "
				+ " or fechaPublicacion like : keyBusqueda "
				+ " or descripcion like : keyBusqueda "
				+ " or tipoPasta like : keyBusqueda "
				+ " or ISBN like : keyBusqueda "
				+ " or numEjemplares like : keyBusqueda "
				+ " or portada like : keyBusqueda "
				+ " or presentacion like : keyBusqueda "				
				+ " or precio like : keyBusqueda ", Libro.class);
		query.setParameter("keyBusqueda", "%"+busqueda+"%");				
		return query.getResultList();
		
	}

}
