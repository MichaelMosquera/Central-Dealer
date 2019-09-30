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
	
	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombreTienda() {
		return nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public String getDireccionTienda() {
		return direccionTienda;
	}

	public void setDireccionTienda(String direccionTienda) {
		this.direccionTienda = direccionTienda;
	}

	public String getIdDueño() {
		return idDueño;
	}

	public void setIdDueño(String idDueño) {
		this.idDueño = idDueño;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Tienda [nit=" + nit + ", nombre=" + nombreTienda + ", direccion=" + direccionTienda + ", dueño=" + idDueño + ", email=" + email + "]";
	}
}
