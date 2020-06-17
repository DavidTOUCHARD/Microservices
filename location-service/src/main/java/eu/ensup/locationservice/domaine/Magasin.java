package eu.ensup.locationservice.domaine;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Magasin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;
	private String nom;

	@ManyToOne
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Adresse adresse;
	
//	@Transient
//	@ManyToOne
//	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//	private Produit produit;
//	
//	@Transient
//	@OneToMany(mappedBy = "magasin")	
//	private Collection<Produit> produits = new ArrayList<Produit>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

//	public Produit getProduit() {
//		return produit;
//	}
//
//	public void setProduit(Produit produit) {
//		this.produit = produit;
//	}
//
//	public Collection<Produit> getProduits() {
//		return produits;
//	}
//
//	public void setProduits(Collection<Produit> produits) {
//		this.produits = produits;
//	}
	
	
	
}
