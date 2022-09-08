package com.idat.empresario.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="empresario")
public class Empresario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idempresario;
	private String nombre;
	private String apellido;
	private String celular;
}
