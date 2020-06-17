package eu.ensup.locationservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.ensup.locationservice.dao.AdresseRepository;
import eu.ensup.locationservice.domaine.Adresse;
import eu.ensup.locationservice.domaine.Magasin;

@Service
public class AdresseService implements IAdresseService{

	@Autowired
	AdresseRepository dao;
	
	@Override
	public List<Adresse> findAllAdresses() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Adresse getAdresse(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}


}
