package eu.ensup.inventoryservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.ensup.inventoryservice.domaine.Produit;

@Repository
public interface ProduitRepository  extends JpaRepository<Produit, Long>{

	public Produit getById(Long id);
}
