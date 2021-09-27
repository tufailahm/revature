package com.revature.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pms.dao.ProductDAO;
import com.revature.pms.model.Product;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	ProductDAO productDAO;
	
	@GetMapping()
	public List<Product> getProducts(){
		
		return productDAO.findAll();
	}
	
	
	@PostMapping()
	public String saveProduct(@RequestBody Product product) {
		productDAO.save(product);
		return "Congrats your product saved successfully";
	}
	
}
