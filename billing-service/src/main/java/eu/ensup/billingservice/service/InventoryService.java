package eu.ensup.billingservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import eu.ensup.billingservice.domaine.Produit;

@FeignClient(name="INVENTORY-SERVICE")
public interface InventoryService {
	
	@GetMapping("/produits/produit/{id}")
	public Produit findProductById(@PathVariable(name="id")Long id);

}
