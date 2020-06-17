package eu.ensup.billingservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.ensup.billingservice.dao.BillRepository;
import eu.ensup.billingservice.dao.ProductItemRepository;
import eu.ensup.billingservice.domaine.Bill;
import eu.ensup.billingservice.domaine.ProductItem;

@Service
public class ProductItemService implements IProductItemService {

	@Autowired
	ProductItemRepository dao;
	
	@Autowired
	BillRepository daoBill;
	@Override
	public ProductItem getProductItem(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public List<ProductItem> findAllProductItems() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<ProductItem> findProductItemsByBill(Long id) {
		// TODO Auto-generated method stub
		Bill b = daoBill.getById(id);
		return dao.findProductItemByBill(b);
	}

}
