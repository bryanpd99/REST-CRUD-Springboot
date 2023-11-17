package com.api.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "usuarios")
public class Usuario {
	@Id
	@Column(name = "id_usuario",nullable = false,insertable = false)
	private Long idUsuario;
	@Column(name = "username")
	private String userName;
	@Column(name = "password")
	private String password;
	@Column(name = "mail")
	private String mail;
	@Column(name = "status")
	private String status;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "usuario",insertable = false,updatable=false)
	private Persona persona;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "session")
	private List<Session> sessions;
}
