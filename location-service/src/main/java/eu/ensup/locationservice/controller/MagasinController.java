package eu.ensup.locationservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.ensup.locationservice.domaine.Adresse;
import eu.ensup.locationservice.domaine.Magasin;
import eu.ensup.locationservice.service.IAdresseService;
import eu.ensup.locationservice.service.IMagasinService;

@RestController
@RequestMapping("/magasins")
public class MagasinController {
	
	@Autowired
	IMagasinService magasinService;
	
	@Autowired
	IAdresseService adresseService; 
	
	
	@GetMapping(value="/adresse/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Magasin> getMagasins(@PathVariable("id")Long id) {
			
		return magasinService.findMagasinsByAdresse(adresseService.getAdresse(id));		
		
	}
	
}
