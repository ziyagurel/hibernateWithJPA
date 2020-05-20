package com.ziyagurel.springProject.hibernateWithJPA.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.ziyagurel.springProject.hibernateWithJPA.Entites.City;

public class HibernateCityDal implements ICityDal{

	private EntityManager entity;
	
	@Autowired
	public HibernateCityDal(EntityManager entity) {
		this.entity = entity;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		Session session = entity.unwrap(Session.class);
		List<City> cities = session.createQuery("from city", City.class).getResultList();
		return cities;
	}

	@Override
	public void add(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(City city) {
		// TODO Auto-generated method stub
		
	}

}
