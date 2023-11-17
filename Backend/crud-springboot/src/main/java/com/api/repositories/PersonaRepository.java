package com.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.models.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{
	Persona findByIdentificacion(String identificacion);
	@Query("SELECT p FROM Persona p WHERE p.identificacion = ?1")
	Persona findUserByCedula(String identificacion);

}
