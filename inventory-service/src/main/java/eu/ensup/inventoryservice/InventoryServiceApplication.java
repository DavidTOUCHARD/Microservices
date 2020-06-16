package eu.ensup.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import eu.ensup.inventoryservice.dao.ProduitRepository;
import eu.ensup.inventoryservice.domaine.Produit;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProduitRepository produitRepository) {
		return args -> {
			produitRepository.save(new Produit("pain","0.90€","baguette tradition")); 
			produitRepository.save(new Produit("kinders","2.99 €","kinders buenos"));
			produitRepository.save(new Produit("vin","50.00 €","Saint Emilion 1997"));
			produitRepository.findAll().forEach(System.out::println);
		};
	}
}
