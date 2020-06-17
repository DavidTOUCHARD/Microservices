package eu.ensup.billingservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.ensup.billingservice.domaine.Bill;
import eu.ensup.billingservice.domaine.ProductItem;

@Repository
public interface ProductItemRepository  extends JpaRepository<ProductItem, Long>{

	public ProductItem getById(Long id);
	
	public List<ProductItem> findProductItemByBill(Bill b);
}