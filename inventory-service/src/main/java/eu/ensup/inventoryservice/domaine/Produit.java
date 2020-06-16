package eu.ensup.inventoryservice.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	public Long id;
	public String name;
	public String price;
	public String description;
	
	
	@Override
	public String toString() {
		return "Produit [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + "]";
	}
	public Produit(String name, String price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}
	public Produit() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
