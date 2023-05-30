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
public class Apoderado {

	private int id;
	private String rut;
	private String nombre;
	private String direccion;
	private String telefono;
	private String email;

	public void crearPostulacion() {

	}

	public void obtenerInformacion() {

	}
}
