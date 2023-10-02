package com.mabrouki.springbootng.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mabrouki.springbootng.dto.ProductDto;
import com.mabrouki.springbootng.models.CommandeProduct;
import com.mabrouki.springbootng.models.CommandeProductPK;
import com.mabrouki.springbootng.models.Product;




@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "commandeProducts", path = "commandeProducts")
public interface CommandeProductsRepository extends JpaRepository<CommandeProduct, CommandeProductPK>{
	@Query("select p from CommandeProduct cp  join cp.product p where cp.commandeId =:id")
	public List<Product> findByCommande(@Param("id") int id);
	
	@Query("select new com.mabrouki.springbootbackfrontend.dto.ProductDto(p.productName,p.description,p.data,cp.quantite) from CommandeProduct cp  join cp.product p where cp.commandeId =:id")
	
	public List<ProductDto> findByCommandeDto(@Param("id") int id);

}
