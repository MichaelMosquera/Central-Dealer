package com.ronaldarias.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldarias.apirest.models.entity.Tendero;
import com.ronaldarias.apirest.models.entity.Tienda;
import com.ronaldarias.apirest.models.service.TenderoService;
import com.ronaldarias.apirest.models.service.TiendaService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CDRestController {

	// injection dependency
	@Autowired
	private TenderoService tenderoService;
	
	@Autowired
	private TiendaService tiendaService;

	@GetMapping("/tenderos")
	public List<Tendero> getCustomers() {
		return tenderoService.getCustomers();
	}

	@GetMapping("/tenderos/{documento}")
	public Tendero getCustomer(@PathVariable int documento) {

		Tendero tendero = tenderoService.getTendero(documento);

		return tendero;
	}
	
	@GetMapping("/tienda/{nit}")
	public Tienda getTienda(@PathVariable String nit) {
		Tienda tienda= tiendaService.getTienda(nit);
		return tienda;
	}

	// add mapping for POST /customers - add new customer

	@PostMapping("/tenderos")
	@ResponseStatus(HttpStatus.CREATED)
	public Tendero addCustomer(@RequestBody Tendero tendero) {

		// also just in case the pass an id in JSON ... set id to 0
		// this is force a save of new item ... instead of update

		//customer.setId(null);

		tenderoService.saveTendero(tendero);

		return tendero;
	}
	
	// add mapping for PUT /customers - update existing customer
	
	@PutMapping("/tenderos")
	@ResponseStatus(HttpStatus.CREATED)
	public Tendero updateCustomer(@RequestBody Tendero tendero) {
		
		tenderoService.saveTendero(tendero);
		
		return tendero;
	}
	
	
	//add mapping for DELETE /customers/{customerId} - delete existing customer
	@DeleteMapping("/tenderos/{documento}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCustomer(@PathVariable int documento) {
		
		tenderoService.deleteTendero(documento);
	}

}
