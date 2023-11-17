package com.api.models;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "sessions")
public class Session {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_session",nullable = false,updatable = false)
	private long idSession;
	@Column(name = "fecha_ingreso")
	private Date fechaIngreso;
	@Column(name = "fecha_cierre")
	private Date fechaCierre;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "usuario",insertable = false,updatable=false)
	private Usuario usuario;
	

}
