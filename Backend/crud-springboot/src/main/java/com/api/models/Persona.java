package com.api.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_usuario", nullable = false, insertable=false)
	private Long idPersona;
	@Column(name= "nombres")
	private String nombres;
	@Column(name= "edad")
	private int age;
	@Column(name= "apellidos")
	private String apellidos;
	@Column(name= "identificacion",unique = true)
	private String email;
	@Column(name= "fecha_nacimiento")
	private Date fechaNacimiento;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "persona")
	private List<Usuario> usuarios;

}
