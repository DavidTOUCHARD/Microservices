package eu.ensup.billingservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.ensup.billingservice.dao.BillRepository;
import eu.ensup.billingservice.domaine.Bill;

@Service
public class BillService implements IBillService{

	@Autowired
	BillRepository dao;
	@Override
	public Bill getBill(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public List<Bill> findAllBills() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
