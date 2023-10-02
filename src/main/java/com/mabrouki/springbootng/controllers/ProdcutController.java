package com.mabrouki.springbootng.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.mabrouki.springbootng.services.ProductServiceImpl;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProdcutController {
	
	private final ProductServiceImpl productServiceImpl;

}
