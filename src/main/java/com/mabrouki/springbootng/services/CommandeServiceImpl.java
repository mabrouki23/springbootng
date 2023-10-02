package com.mabrouki.springbootng.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mabrouki.springbootng.repositories.CommandeRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class CommandeServiceImpl implements CommandeServiceInterface {
	
	private final CommandeRepository commandeRepository;
}
