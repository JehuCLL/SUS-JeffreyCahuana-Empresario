package com.idat.empresario.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="empresario")
public class Empresario {
	
	private Integer idempresario;
	private String nombre;
	private String apellido;
	private String celular;
}
