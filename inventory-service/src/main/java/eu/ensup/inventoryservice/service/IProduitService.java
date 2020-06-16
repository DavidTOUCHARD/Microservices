package eu.ensup.inventoryservice.service;

import java.util.List;

import eu.ensup.inventoryservice.domaine.Produit;

public interface IProduitService {

	public void addProduit(Produit p);
    public List<Produit> getAll();   
    public Produit getById(Long id);
}
