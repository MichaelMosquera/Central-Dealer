package com.ronaldarias.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ronaldarias.apirest.models.entity.Producto;

public interface ProductoDAO extends CrudRepository<Producto, Integer> {

}
