package com.sebas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sebas.repository.IPersonaRepo;
@Service
public class PersonaServImpl implements IPersonaServ{
	@Autowired
	@Qualifier("personaRepo2")
	private IPersonaRepo iPersonaRepo;
	
	@Override
	public void registrarPersona(String nombre) {
		// TODO Auto-generated method stub
		iPersonaRepo.registrarPersona(nombre);
	}

}
