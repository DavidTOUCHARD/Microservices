package eu.ensup.locationservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import eu.ensup.locationservice.dao.AdresseRepository;
import eu.ensup.locationservice.dao.MagasinRepository;
import eu.ensup.locationservice.domaine.Adresse;
import eu.ensup.locationservice.domaine.Magasin;
import eu.ensup.locationservice.service.AdresseService;
import eu.ensup.locationservice.service.MagasinService;

@SpringBootApplication
public class LocationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(AdresseRepository adresseRepository, MagasinRepository magasinRepository) 
	{
		return args -> {
			Adresse ad1 = new Adresse();
			ad1.setNomRue("labas");
			ad1.setNumRue("20");
			ad1.setVille("le pecq");
			ad1.setCodePostal("78230");
			adresseRepository.save(ad1);
			
			Magasin m1 = new Magasin();
			m1.setAdresse(ad1);
			m1.setNom("Carrefour");
			magasinRepository.save(m1);
		};
		
}
}
