package com.mabrouki.springbootng.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
private	String productName;
private String description;
private byte[] data;
private int quantite;
}
