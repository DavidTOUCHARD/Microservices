package eu.ensup.customerservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.ensup.customerservice.domaine.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	public Customer getById(Long id);
}
