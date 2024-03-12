package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Empresa;
import com.distribuida.entities.Reportes;


@Repository
public class ReportesDAOImpl implements ReportesDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Reportes> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Reportes", Reportes.class).getResultList();
	}

	@Override
	@Transactional
	public Reportes findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Reportes.class, id);
	}

	@Override
	@Transactional
	public void add(Reportes reportes) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(reportes);
	}

	@Override
	@Transactional
	public void up(Reportes reportes) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(reportes);
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
	public List<Reportes> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<Reportes> query = session.createQuery("SELECT FROM Reportes au WHERE au.idReporte =: idReporte"
				+ "au.reporte LIKE : busqueda"
				+ "au.fechaReporte LIKE : busqueda"
				+ "au.descripcion LIKE : busqueda", Reportes.class);
	
		query.setParameter("busqueda", "%"+busqueda+"%");
				return query.getResultList();
	}

}
