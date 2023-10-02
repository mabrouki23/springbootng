package com.mabrouki.springbootng.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mabrouki.springbootng.dto.ProductDto;
import com.mabrouki.springbootng.models.CommandeProduct;
import com.mabrouki.springbootng.models.Product;
import com.mabrouki.springbootng.services.CommandeProductServiceImpl;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@RestController

@RequestMapping(path = "/api")

public class CommandeProductController {

private final CommandeProductServiceImpl commandeProductServiceImpl;
@CrossOrigin(origins = "*")
@DeleteMapping("/commandeProducts/{commandeId}/{productId}")
public void delete(@PathVariable("commandeId") Integer commandeId,@PathVariable("productId") Integer productId) {
	commandeProductServiceImpl.deleteProductFromCommande(commandeId, productId);
}
@CrossOrigin(origins = "*")
@PutMapping("/commandeProducts/{commandeId}/{productId}")
public void updateQantiteCommandee(@RequestBody CommandeProduct commandeProduct ,@PathVariable("commandeId") Integer commandeId,@PathVariable("productId") Integer productId) {
	commandeProductServiceImpl.updateQantiteCommandee(commandeProduct,commandeId, productId);
}
@CrossOrigin(origins = "*")
@GetMapping("/commandeProducts/{commandeId}/products")
public List<Product> getAllProductByCommande(@PathVariable("commandeId") int commandeId) {
	return commandeProductServiceImpl.getAllProductByCommande(commandeId);
	}

@CrossOrigin(origins = "*")
@GetMapping("/commandeProducts/{commandeId}/productDtos")
public List<ProductDto> getAllProductDtoByCommande(@PathVariable("commandeId") int commandeId) {
	return commandeProductServiceImpl.getAllProductDtoByCommande(commandeId);
	}
}
