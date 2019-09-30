package com.ronaldarias.apirest.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tienda")
public class Tienda {
	
	@Id
	@Column(name="nittienda")
	private String nit;

	@Column(name="nombretienda")
	private String nombreTienda;
	
	@Column(name="direcciontienda")
	private String direccionTienda;
	
	@Column(name="duenotienda")
	private String idDueño;
	
	@Column(name="emailtienda")
	private String email;
}
