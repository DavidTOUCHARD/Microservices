package eu.ensup.locationservice.service;

import java.util.List;

import eu.ensup.locationservice.domaine.Adresse;
import eu.ensup.locationservice.domaine.Magasin;

public interface IAdresseService {

	public Adresse getAdresse(Long id);
	public List<Adresse> findAllAdresses();
	
}
