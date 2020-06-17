/**
 * 
 */
package eu.ensup.locationservice.service;

import java.util.List;

import eu.ensup.locationservice.domaine.Adresse;
import eu.ensup.locationservice.domaine.Magasin;

/**
 * @author David
 *
 */
public interface IMagasinService {

	public Magasin getMagasin(Long id);
	public List<Magasin> findAllMagasins();
	List<Magasin> findMagasinsByAdresse(Adresse adresse);
}
