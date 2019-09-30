package com.ronaldarias.apirest.models.service;

import java.util.List;

import com.ronaldarias.apirest.models.entity.Producto;

public interface ProductoService {
	
	public List<Producto> getProducto();

	public void saveProducto (Producto theProducto);

	public Producto getProducto (Integer theId);

	public void deleteProducto (Integer theId);



}
