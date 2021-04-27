package com.sebas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sebas.service.IPersonaServ;

@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner{
	private static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);
	@Autowired
	private IPersonaServ iPersonaServ;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("¡BIENVENIDO SEBASTIÁN GABRIEL ACOSTA MECA!");
		String nombre = "JACOSTA";
		iPersonaServ.registrarPersona(nombre);
		LOG.info("¡EXITO!");
	}
}
