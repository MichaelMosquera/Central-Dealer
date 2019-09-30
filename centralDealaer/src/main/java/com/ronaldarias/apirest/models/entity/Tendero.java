package com.ronaldarias.apirest.models.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tenderos")
public class Tendero {
	
	@Id
	@Column(name="documentotendero")
	private Integer documento;
	
	@Column(name="nombretendero")
	private String nombre;
	
	@Column(name="apellidotendero")
	private String apellido;
	
	@Column(name="telefonotendero")
	private String telefono;
	
	@Column(name="estadotendero")
	private String estado="ON";
	
	
	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Tendero() {
		
	}


	public Integer getDocumento() {
		return documento;
	}


	public void setDocumento(Integer documento) {
		this.documento = documento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}





	@Override
	public String toString() {
		return "Tendero [id=" + documento + ", firstName=" + nombre + ", lastName=" + apellido + ", Telefono=" + telefono + ", estado=" + estado + "]";
	}

}
