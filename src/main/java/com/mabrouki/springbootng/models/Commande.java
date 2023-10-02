package com.mabrouki.springbootng.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


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
@Table(name = "commande")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "commandeId")
public class Commande implements Serializable {   
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "commande_id")
    private Integer commandeId;
    @Column(name = "commande_type")
    private String commandeType;
    @Basic(optional = false)
    @Column(name = "in_progress")
    private boolean inProgress;
    @Basic(optional = false)
    @Column(name = "is_canceled")
    private boolean isCanceled;
    @Basic(optional = false)
    @Column(name = "is_delivered")
    private boolean isDelivered;
    @Basic(optional = false)
    @Column(name = "is_paid")
    private boolean isPaid;
    @Basic(optional = false)
    @Column(name = "is_ready")
    private boolean isReady;
    @Column(name = "payment_type")
    private String paymentType;
    @Basic(optional = false)
    @Column(name = "tax_price")
    private double taxPrice;
    @Basic(optional = false)
    @Column(name = "total_price")
    private double totalPrice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "commande") 

 private Set<CommandeProduct> commandeProducts=new HashSet<CommandeProduct>();

   
}
