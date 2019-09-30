package com.ronaldarias.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ronaldarias.apirest.models.entity.Tendero;
import com.ronaldarias.apirest.models.entity.Tienda;

public interface TiendaDAO extends CrudRepository<Tienda, String> {

}