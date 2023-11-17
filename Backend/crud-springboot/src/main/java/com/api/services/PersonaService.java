package com.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.models.Persona;
import com.api.repositories.PersonaRepository;

@Service
public class PersonaService {
	@Autowired
	private PersonaRepository personaRepository;
	public Persona savePersona(Persona persona) {
		return personaRepository.save(persona);
		
	}
	public List<Persona> listarPersonas(){
		return personaRepository.findAll();
		}
	public Persona getPersona(String identificacion) {
		return personaRepository.findByIdentificacion(identificacion);
	}

}
