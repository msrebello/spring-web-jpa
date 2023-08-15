package com.matheusdev.springwebjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusdev.springwebjpa.entities.Category;
import com.matheusdev.springwebjpa.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> findAll() {

		return categoryRepository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> order = categoryRepository.findById(id);
		return order.get();
	}

}
