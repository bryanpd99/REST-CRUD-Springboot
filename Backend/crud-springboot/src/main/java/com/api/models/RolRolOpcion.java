package com.api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name = "rol_rol_opciones")
@Data
public class RolRolOpcion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_usuario", nullable = false, insertable=false)
	private Long idRolRolOpcion;

}
