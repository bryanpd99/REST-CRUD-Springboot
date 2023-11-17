package com.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.models.Session;
import com.api.models.Usuario;

public interface SessionRepository extends JpaRepository<Session, Long>{
	Session findByUsuario(Usuario usuario);

}
