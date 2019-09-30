package com.ronaldarias.apirest.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ronaldarias.apirest.models.dao.TiendaDAO;

import com.ronaldarias.apirest.models.entity.Tienda;

@Service
public class TiendaServiceImpl implements TiendaService{
	
	@Autowired
	private TiendaDAO tiendaDAO;

	@Override
	@Transactional
	public void saveTienda(Tienda tienda) {
		// TODO Auto-generated method stub
		tiendaDAO.save(tienda);
	}

	@Override
	@Transactional(readOnly=true)
	public Tienda getTienda(String nit) {
		// TODO Auto-generated method stub
		return tiendaDAO.findById(nit).get();
	}

	@Override
	@Transactional
	public void deleteTienda(String documento) {
		// TODO Auto-generated method stub
		tiendaDAO.deleteById(documento);
	}
	
	

	

}

