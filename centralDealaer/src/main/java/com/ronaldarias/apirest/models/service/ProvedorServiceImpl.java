package com.ronaldarias.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ronaldarias.apirest.models.dao.ProvedorDAO;
import com.ronaldarias.apirest.models.entity.Provedor;

@Service
public class ProvedorServiceImpl implements ProvedorService {

	// need to inject customer DAO
	@Autowired
	private ProvedorDAO provedorDAO;

	@Override
	@Transactional(readOnly=true)
	public List<Provedor> getProvedor() {
		return (List<Provedor>) provedorDAO.findAll();
	}

	@Override
	@Transactional
	public void saveProvedor(Provedor theProvedor) {

		provedorDAO.save(theProvedor);
	}

	@Override
	@Transactional(readOnly=true)
	public Provedor getProvedor(Integer theId) {

		return provedorDAO.findById(theId).get();
	}

	@Override
	@Transactional
	public void deleteProvedor(Integer theId) {
		provedorDAO.deleteById(theId);
	}

}
