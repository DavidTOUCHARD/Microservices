package eu.ensup.inventoryservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.ensup.inventoryservice.domaine.Produit;
import eu.ensup.inventoryservice.service.IProduitService;

@RestController
@RequestMapping("/produits")
public class ProduitController {
	
	@Autowired
	IProduitService service;
	
	@GetMapping(value="/getAll",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Produit> customers()
	{
		return service.getAll();
	}
	
	@PostMapping("/saveCustomer")
	public void saveCustomer(@RequestBody Produit produit) 
	{
		service.addProduit(produit);
	}
	
	@GetMapping(value="/produit/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public Produit customerbyId(@PathVariable Long id)
	{
		return service.getById(id);
	}

}
