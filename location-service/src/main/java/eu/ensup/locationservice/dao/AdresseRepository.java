package eu.ensup.locationservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.ensup.locationservice.domaine.Adresse;

@Repository
public interface AdresseRepository  extends JpaRepository<Adresse, Long>{
}
