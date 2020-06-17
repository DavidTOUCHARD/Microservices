package eu.ensup.billingservice;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import eu.ensup.billingservice.dao.BillRepository;
import eu.ensup.billingservice.dao.ProductItemRepository;
import eu.ensup.billingservice.domaine.Bill;
import eu.ensup.billingservice.domaine.Customer;
import eu.ensup.billingservice.domaine.ProductItem;
import eu.ensup.billingservice.domaine.Produit;
import eu.ensup.billingservice.service.CustomerService;
import eu.ensup.billingservice.service.InventoryService;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(BillRepository billRepository, ProductItemRepository productItemRepository,
			CustomerService customerService, InventoryService inventoryService) 
	{
		return args -> {
			Customer c = customerService.findCustomerById(1L);
			Customer c2 = customerService.findCustomerById(2L);
			System.out.println("informations du client");
			System.out.println("*************************");
			System.out.println(c.getId());
			System.out.println(c.getNom());
			System.out.println(c.getPrenom());
			System.out.println(c.getEmail());
			System.out.println("*************************");
			Produit p = inventoryService.findProductById(1L);
			Produit p2 = inventoryService.findProductById(2L);
			System.out.println("*************************");
			System.out.println("information produit");
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getPrice());
			System.out.println(p.getDescription());
			System.out.println("*************************");
			
			//Créer une facture
			Bill bill1 = new Bill();
			bill1.setBillingDate(new Date());		
			bill1.setCustomerID(1L);
			billRepository.save(bill1);
			System.out.println("facture 1 créée");
			
			//Créer une facture
			Bill bill2 = new Bill();
			bill2.setBillingDate(new Date());		
			bill2.setCustomerID(c2.getId());
			billRepository.save(bill2);
			System.out.println("facture 1 créée");
			
			//Ajouter les produits dans la facture
			ProductItem pi = new ProductItem();
			pi.setBill(bill1);
			pi.setProductID(p.getId());
			pi.setQuantity(1);
			pi.setPrice(p.getPrice());
			productItemRepository.save(pi);
			
			ProductItem pi2 = new ProductItem();
			pi2.setBill(bill2);
			pi2.setProductID(p2.getId());
			pi2.setQuantity(1);
			pi2.setPrice(p2.getPrice());
			productItemRepository.save(pi2);
			//Bill bill1 = billRepository.save(new Bill(new Date(), c.getId(),null,null));
		};

	}
}
