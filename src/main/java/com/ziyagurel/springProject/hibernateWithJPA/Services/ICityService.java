package com.ziyagurel.springProject.hibernateWithJPA.Services;

import java.util.List;

import com.ziyagurel.springProject.hibernateWithJPA.Entites.City;

public interface ICityService {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}
