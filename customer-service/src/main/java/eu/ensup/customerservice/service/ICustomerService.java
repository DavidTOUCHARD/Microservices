package eu.ensup.customerservice.service;

import java.util.List;

import eu.ensup.customerservice.domaine.Customer;

public interface ICustomerService {

	public void saveCustomer(Customer customer);
    public List<Customer> getAll();   
    public Customer getById(Long id);
}
