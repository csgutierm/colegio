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
public class PlanDePago {

	private int idPlan;
	private Date fecha;
	private int numeroMensualidades;


	public void calcularMensualidades() {

	}

	public void generarRecibo() {

	}
}
