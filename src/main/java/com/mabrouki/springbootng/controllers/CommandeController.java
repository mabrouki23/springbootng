package com.mabrouki.springbootng.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.mabrouki.springbootng.services.CommandeServiceImpl;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class CommandeController {
	
	private final CommandeServiceImpl commdandeServiceImpl;
}
