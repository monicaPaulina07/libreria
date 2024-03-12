package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.TipoUsuario;

@Repository
public class TipoUsuarioDAOImpl implements TipoUsuarioDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<TipoUsuario> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from TipoUsuario", TipoUsuario.class).getResultList();
		

		
	}

	@Override
	@Transactional
	public TipoUsuario findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		return session.get(TipoUsuario.class, id);
	}

	@Override
	@Transactional
	public void add(TipoUsuario TipoUsuario) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		//TipoUsuario TipoUsuario1 = new TipoUsuario();
		//Actulizar
		//TipoUsuario TipoUsuario2 = new TipoUsuario();
		session.saveOrUpdate(TipoUsuario);
	}

	@Override
	@Transactional
	public void up(TipoUsuario TipoUsuario) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(TipoUsuario);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(findOne(id));
	}

}
