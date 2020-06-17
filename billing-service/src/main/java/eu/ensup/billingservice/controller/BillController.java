package eu.ensup.billingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.ensup.billingservice.domaine.Bill;
import eu.ensup.billingservice.service.CustomerService;
import eu.ensup.billingservice.service.IBillService;
import eu.ensup.billingservice.service.IProductItemService;
import eu.ensup.billingservice.service.InventoryService;


@RestController
@RequestMapping("/bills")
public class BillController {

	@Autowired
	IBillService bill;
	
	@Autowired
	IProductItemService productItemService; 
	
	@Autowired
	CustomerService customer;
	
	@Autowired
	InventoryService product;
	
	@GetMapping(value="/fullBill/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public Bill getBill(@PathVariable("id")Long id) {
		Bill bill1 = bill.getBill(id);
		bill1.setCustomer(customer.findCustomerById(bill1.getCustomerID()));
		
		bill1.setProductItems(productItemService.findProductItemsByBill(bill1.getId()));
		bill1.getProductItems().forEach(pi -> {
			pi.setProduct(product.findProductById(pi.getProductID()));
		});		
		return bill1;
		
	}
}
