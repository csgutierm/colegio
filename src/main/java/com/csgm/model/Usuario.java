package com.csgm.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Usuario {

	private int id;
	private String rut;
	private String nombre;
	private String email;
	private String clave;
	
	

	public void autenticarUsuario() {

	}

	public void terminarSesion() {

	}
}
