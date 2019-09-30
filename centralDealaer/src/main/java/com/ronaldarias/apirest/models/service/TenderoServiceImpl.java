package com.ronaldarias.apirest.models.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ronaldarias.apirest.models.dao.TenderoDAO;
import com.ronaldarias.apirest.models.entity.Tendero;

@Service
public class TenderoServiceImpl implements TenderoService {

	// need to inject customer DAO
	@Autowired
	private TenderoDAO tenderoDAO;

	@Override
	@Transactional(readOnly=true)
	public List<Tendero> getCustomers() {
		return (List<Tendero>) tenderoDAO.findAll();
	}

	@Override
	@Transactional
	public void saveTendero(Tendero tendero) {

		tenderoDAO.save(tendero);
	}

	@Override
	@Transactional(readOnly=true)
	public Tendero getTendero(Integer documento) {

		return tenderoDAO.findById(documento).get();
	}

	@Override
	@Transactional
	public void deleteTendero(Integer documento) {

		tenderoDAO.deleteById(documento);
	}

}
