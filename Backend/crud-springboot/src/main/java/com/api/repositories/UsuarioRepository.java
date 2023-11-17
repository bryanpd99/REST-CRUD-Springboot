package com.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.models.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{
	 Usuario findByUserName(String userName);

}
