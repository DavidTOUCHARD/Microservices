package eu.ensup.billingservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.ensup.billingservice.domaine.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long>{

	public Bill getById(Long id);

}
