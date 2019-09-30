package com.ronaldarias.apirest.models.service;

import java.util.List;

import com.ronaldarias.apirest.models.entity.Tendero;
import com.ronaldarias.apirest.models.entity.Tienda;

public interface TiendaService {
	
	public void saveTienda(Tienda tienda);

	public Tienda getTienda(String nit);

	public void deleteTienda(String nit);

}
