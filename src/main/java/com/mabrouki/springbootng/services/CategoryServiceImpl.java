package com.mabrouki.springbootng.services;

import org.springframework.stereotype.Service;

import com.mabrouki.springbootng.repositories.CategoryRepository;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryServiceInterface{
	
	private final CategoryRepository categoryRepository;
	

}
