package com.mabrouki.springbootng.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mabrouki.springbootng.models.Category;
import com.mabrouki.springbootng.repositories.CategoryRepository;
import com.mabrouki.springbootng.services.CategoryServiceImpl;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
@RequestMapping("/categories")
public class CategoryController {
	
	private final CategoryServiceImpl categoryServiceImpl;
	private final CategoryRepository categoryRepository;
	@GetMapping
	public List<Category> getAllCategories(){
		
		
		return categoryRepository.findAll();
	}
	@GetMapping(path = "/cats")
	public List<Category> AllCategories(){
		
		
		return categoryRepository.findAll();
	}
}
