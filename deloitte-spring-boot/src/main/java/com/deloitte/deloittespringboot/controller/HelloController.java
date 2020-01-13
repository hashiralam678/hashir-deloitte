package com.deloitte.deloittespringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.deloittespringboot.model.Product;
//import com.deloitte.deloittespringboot.repo.ProductRepo;
import com.deloitte.deloittespringboot.service.ProductService;

//@Controller
@RestController
public class HelloController {

//	  @GetMapping("/hello")
//		public String sayHello(Model m) {
//		m.addAttribute("msg","How are you?");
//		return "show";
	@Autowired
	ProductService service;

	@PostMapping("/products")
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}

	@GetMapping("/products/id/{pId}")
	public ResponseEntity<Product> getProductById(@PathVariable("pId") int pId) {
		ResponseEntity<Product> p = new ResponseEntity<Product>(service.getProductById(pId), HttpStatus.OK);

		return p;
	}

	@DeleteMapping("/products/{pId}")
	public ResponseEntity<Product> deleteProductById(@PathVariable("pId") int pId) {
		ResponseEntity<Product> p;
		if (service.checkIfExists(pId)) {
			service.deleteProductById(pId);
			p = new ResponseEntity<Product>(HttpStatus.OK);
		} else {
			p = new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
		return p;
	}
}
