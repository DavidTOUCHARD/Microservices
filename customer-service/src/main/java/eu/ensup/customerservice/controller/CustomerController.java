package eu.ensup.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import eu.ensup.customerservice.domaine.Customer;
import eu.ensup.customerservice.service.ICustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	ICustomerService service;
	
	@GetMapping(value="/getAll",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Customer> customers()
	{
		return service.getAll();
	}
	
	@PostMapping("/saveCustomer")
	public void saveCustomer(@RequestBody Customer customer) 
	{
		service.saveCustomer(customer);
	}
	
	@GetMapping(value="/customer/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public Customer customerbyId(@PathVariable Long id)
	{
		return service.getById(id);
	}
	
	
}
