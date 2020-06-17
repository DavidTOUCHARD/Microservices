package eu.ensup.billingservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import eu.ensup.billingservice.domaine.Customer;

@FeignClient(name="CUSTOMER-SERVICE")
public interface CustomerService {

	@GetMapping("/customers/customer/{id}")
	public Customer findCustomerById(@PathVariable(name="id")Long id);
}
