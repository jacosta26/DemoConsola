package com.sebas.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("personaRepo1")
public class PersonaRepoImpl implements IPersonaRepo{
	private static Logger LOG = LoggerFactory.getLogger(PersonaRepoImpl.class);
	
	@Override
	public void registrarPersona(String nombre) {
		// TODO Auto-generated method stub
		LOG.info("PersonaRepoImpl===>Se registró a: "+nombre);
	}
}
