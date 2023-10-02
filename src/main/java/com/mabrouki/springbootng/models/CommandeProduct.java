package com.mabrouki.springbootng.models;


import java.util.Objects;
import java.util.Set;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import org.springframework.data.annotation.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author User
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "commande_product")
@IdClass(CommandeProductPK.class)
public class CommandeProduct { 
    @Id
	Integer commandeId;
    @Id
    Integer productId;     
    @Column(name = "quantite")
    private Integer quantite;
    @JoinColumn(name = "commande_id", referencedColumnName = "commande_id", insertable = false, updatable = false)
    @JsonIgnoreProperties("commande")
    @ManyToOne(optional = false ,fetch = FetchType.LAZY)    
    private Commande commande;
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)    
    private Product product;   
   
    
}
