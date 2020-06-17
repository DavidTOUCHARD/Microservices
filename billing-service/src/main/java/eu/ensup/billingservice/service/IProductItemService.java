package eu.ensup.billingservice.service;

import java.util.List;

import eu.ensup.billingservice.domaine.ProductItem;

public interface IProductItemService {

	
	public ProductItem getProductItem(Long id);
	public List<ProductItem> findAllProductItems();
	public List<ProductItem> findProductItemsByBill(Long id);
}
