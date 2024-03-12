package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Usuario", Usuario.class).getResultList();
		

		
	}

	@Override
	@Transactional
	public Usuario findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		return session.get(Usuario.class, id);
	}

	@Override
	@Transactional
	public void add(Usuario usuario) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		//usuario usuario1 = new usuario();
		//Actulizar
		//usuario usuario2 = new usuario();
		session.saveOrUpdate(usuario);
	}

	@Override
	@Transactional
	public void up(Usuario usuario) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(usuario);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(findOne(id));
	}

}
