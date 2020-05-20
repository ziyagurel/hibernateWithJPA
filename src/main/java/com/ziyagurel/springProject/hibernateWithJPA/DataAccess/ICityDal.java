package com.ziyagurel.springProject.hibernateWithJPA.DataAccess;

import java.util.List;

import com.ziyagurel.springProject.hibernateWithJPA.Entites.City;

public interface ICityDal {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
}
