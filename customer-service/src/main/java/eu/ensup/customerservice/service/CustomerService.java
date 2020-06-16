package eu.ensup.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.ensup.customerservice.dao.CustomerRepository;
import eu.ensup.customerservice.domaine.Customer;

@Service
public class CustomerService implements ICustomerService{

	@Autowired
	CustomerRepository dao;
	
	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		dao.save(customer); 
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Customer getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}
	

}
