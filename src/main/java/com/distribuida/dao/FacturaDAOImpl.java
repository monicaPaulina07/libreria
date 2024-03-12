package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Factura;

@Repository
public class FacturaDAOImpl implements FacturaDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Factura> findAll() {
		// TODO Auto-generated method stub
		Session	 session = sessionFactory.getCurrentSession();	
		return session.createQuery("from Factura", Factura.class).getResultList();
		
	}

	@Override
	@Transactional
	public Factura findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Factura.class, id);
		
	}

	@Override
	@Transactional
	public void add(Factura factura) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(factura);

	}

	@Override
	@Transactional
	public void up(Factura factura) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(factura);

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
	public int findMax() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("SELECT max(fa.idFactura) FROM Factura fa");
		return (int) query.getSingleResult();
	}

	@Override
	@Transactional
	public int findOne(String numFactura) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<Factura> query = session.createQuery(" select fa "
				+ "from Factura fa "
				+ "where fa.numFactura like : keyBusqueda ", Factura.class);
		query.setParameter("keyBusqueda", "%"+numFactura+"%");				
		return query.getResultList().get(0).getIdFactura();
	}
	
	@Override
	@Transactional
	public List<Factura> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<Factura> query = session.createQuery(
				"SELECT fa "
				+ " FROM Factura fa"
				+ " WHERE fa.numFactura LIKE : keyBusqueda"
				+ " OR fa.fechaFactura LIKE : keyBusqueda"
				+ " OR fa.totalNeto LIKE : keyBusqueda"
				+ " OR fa.iva LIKE : keyBusqueda"
				+ " OR fa.total LIKE : keyBusqueda"
				, Factura.class);
		
		query.setParameter("keyBusqueda", "%"+busqueda+"%");
		return query.getResultList();
	}
}
