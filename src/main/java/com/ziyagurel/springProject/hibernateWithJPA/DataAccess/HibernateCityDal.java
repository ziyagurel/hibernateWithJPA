package com.ziyagurel.springProject.hibernateWithJPA.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;


import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ziyagurel.springProject.hibernateWithJPA.Entites.City;

@Repository
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
		List<City> cities = session.createQuery("from City", City.class).getResultList();
		return cities;
	}

	@Override
	public void add(City city) {
		Session session = entity.unwrap(Session.class);
		session.saveOrUpdate(city);
	}

	@Override
	public void update(City city) {
		Session session = entity.unwrap(Session.class);
		session.saveOrUpdate(city);
	}

	@Override
	public void delete(City city) {
		Session session = entity.unwrap(Session.class);
		City cityToDelete = session.get(City.class, city.getId());
		session.delete(cityToDelete);
	}

	@Override
	public City getByID(int id) {
		Session session = entity.unwrap(Session.class);
		City city = session.get(City.class, id);
		return city;
	}

}
