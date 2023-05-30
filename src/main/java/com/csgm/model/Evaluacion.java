package com.csgm.model;

import java.util.Date;

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
public class Evaluacion {

	private int id;
	private boolean estado;
	private Date fecha;


	public void autenticarUsuario() {

	}

	public void terminarSesion() {

	}
}
