package eu.ensup.locationservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.ensup.locationservice.domaine.Adresse;
import eu.ensup.locationservice.domaine.Magasin;

@Repository
public interface MagasinRepository extends JpaRepository<Magasin, Long>{
//	
//	public Magasin getById(Long id);
	public List<Magasin> findMagasinsByAdresse(Adresse adresse);

}
