package com.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.models.Persona;
import com.api.services.PersonaService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class PersonaController {
	@Autowired
	private PersonaService personaService;
	@PostMapping("/persona")
	private ResponseEntity<Persona> postPersona(@RequestBody Persona request){
		personaService.savePersona(request);
		return ResponseEntity.ok(request);
	}
	@GetMapping("/personas")
	private ResponseEntity< List<Persona>> getPersonas(){
		return ResponseEntity.ok(personaService.listarPersonas());
	}
	@GetMapping("/persona/{identificacion}")
	private ResponseEntity< Persona> getPersona(@PathVariable("identificacion")String identificacion){
		return ResponseEntity.ok(personaService.getPersona(identificacion));
	}


}
