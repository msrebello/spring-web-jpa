package com.matheusdev.springwebjpa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusdev.springwebjpa.entities.Category;
import com.matheusdev.springwebjpa.entities.Product;
import com.matheusdev.springwebjpa.services.CategoryService;
import com.matheusdev.springwebjpa.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductService productService;

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> orders = productService.findAll();
		return ResponseEntity.ok().body(orders);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product order = productService.findById(id);
		return ResponseEntity.ok().body(order);
	}
}
