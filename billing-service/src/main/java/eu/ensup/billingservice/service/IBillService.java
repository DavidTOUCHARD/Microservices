package eu.ensup.billingservice.service;

import java.util.List;

import eu.ensup.billingservice.domaine.Bill;

public interface IBillService {

	
	public Bill getBill(Long id);
	public List<Bill> findAllBills();
}
