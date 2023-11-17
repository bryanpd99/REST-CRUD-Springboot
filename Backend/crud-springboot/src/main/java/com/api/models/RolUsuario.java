package com.api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "rol_usuario")
public class RolUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_usuario", nullable = false, insertable=false)
	private Long idRolUsuario;

}
