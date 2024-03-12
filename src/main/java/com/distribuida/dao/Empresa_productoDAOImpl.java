package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Empresa_detalles;
import com.distribuida.entities.Empresa_producto;

@Repository
public class Empresa_productoDAOImpl implements Empresa_productoDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Empresa_producto> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Empresa_producto", Empresa_producto.class).getResultList();
	}

	@Override
	@Transactional
	public Empresa_producto findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Empresa_producto.class, id);
	}

	@Override
	@Transactional
	public void add(Empresa_producto empresa_producto) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(empresa_producto);
		
	}

	@Override
	@Transactional
	public void up(Empresa_producto empresa_producto) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(empresa_producto);
		
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
	public List<Empresa_producto> findAll(String busqueda) {
//		Session session = sessionFactory.getCurrentSession();
//		Query<Empresa_producto> query = session.createQuery("SELECT FROM Empresa_producto au WHERE au.idempresa_producto =: idempresa_producto"
//				+ "au.producto LIKE : busqueda"
//				+ "au.descripcion LIKE : busqueda"
//				+ "au.idempresa LIKE : busqueda"
//				+ "au.idproducto LIKE : busqueda", Empresa_producto.class);
//	
//		query.setParameter("busqueda", "%"+busqueda+"%");
//				return query.getResultList();
		return null;
	}

}
