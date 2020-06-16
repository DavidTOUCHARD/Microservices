package eu.ensup.inventoryservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.ensup.inventoryservice.dao.ProduitRepository;
import eu.ensup.inventoryservice.domaine.Produit;
@Service
public class ProduitService implements IProduitService {

	
	@Autowired
	ProduitRepository dao;
	@Override
	public void addProduit(Produit p) {
		// TODO Auto-generated method stub
		dao.save(p);
		
	}

	@Override
	public List<Produit> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Produit getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

}
