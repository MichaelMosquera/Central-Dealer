package com.ronaldarias.apirest.models.service;

import java.util.List;

import com.ronaldarias.apirest.models.entity.Tendero;

public interface TenderoService {
	
	public List<Tendero> getCustomers();

	public void saveTendero(Tendero tendero);

	public Tendero getTendero(Integer documento);

	public void deleteTendero(Integer documento);

}
