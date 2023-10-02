package com.mabrouki.springbootng.services;

import java.util.List;

import com.mabrouki.springbootng.dto.ProductDto;
import com.mabrouki.springbootng.models.CommandeProduct;
import com.mabrouki.springbootng.models.Product;




public interface CommandeProductServiceInterface {
void ajouterProdutToCommande(int commandeId,int productId);	
void deleteProductFromCommande(int commandeId,int productId);
void updateQantiteCommandee(CommandeProduct commandeProduct,int commandeId,int productId);
List<Product> getAllProductByCommande(int commandeId);
List<ProductDto> getAllProductDtoByCommande(int commandeId);
}
