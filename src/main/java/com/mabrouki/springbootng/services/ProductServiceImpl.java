package com.mabrouki.springbootng.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mabrouki.springbootng.repositories.ProductRepository;

import lombok.RequiredArgsConstructor;
@Service
@Transactional
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductServiceInterface {

	private final ProductRepository productRepository;
	
	

}
