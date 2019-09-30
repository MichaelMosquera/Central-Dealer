package com.ronaldarias.apirest.models.service;

import java.util.List;

import com.ronaldarias.apirest.models.entity.Provedor;

public interface ProvedorService {
	
	public List<Provedor> getProvedor();

	public void saveProvedor(Provedor theProvedor);

	public Provedor getProvedor(Integer theId);

	public void deleteProvedor(Integer theId);
  
}
