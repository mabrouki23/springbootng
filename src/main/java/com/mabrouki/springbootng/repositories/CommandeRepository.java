package com.mabrouki.springbootng.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mabrouki.springbootng.models.Commande;


@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "commandes", path = "commandes")
public interface CommandeRepository extends JpaRepository<Commande, Integer> {

}
