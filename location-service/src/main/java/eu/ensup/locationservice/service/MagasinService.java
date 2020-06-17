package eu.ensup.locationservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.ensup.locationservice.dao.AdresseRepository;
import eu.ensup.locationservice.dao.MagasinRepository;
import eu.ensup.locationservice.domaine.Adresse;
import eu.ensup.locationservice.domaine.Magasin;

@Service
public class MagasinService implements IMagasinService {

	@Autowired
	MagasinRepository daoMagasin;

	@Autowired
	AdresseRepository daoAdresse;
	
	@Override
	public List<Magasin> findAllMagasins() {
		// TODO Auto-generated method stub
		return daoMagasin.findAll();
	}

	@Override
	public Magasin getMagasin(Long id) {
		// TODO Auto-generated method stub
		return daoMagasin.findById(id).get();
	}
	
	@Override
    public List<Magasin> findMagasinsByAdresse(Adresse adresse) {
        // TODO Auto-generated method stub
        return daoMagasin.findMagasinsByAdresse(adresse);
    }

}
