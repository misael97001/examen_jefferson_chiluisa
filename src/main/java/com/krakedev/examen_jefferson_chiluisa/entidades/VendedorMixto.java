package com.krakedev.examen_jefferson_chiluisa.entidades;

public class VendedorMixto extends Vendedor{

	public VendedorMixto(String cedula) {
		super(cedula);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcularSueldo() {
		return getSueldoFijo()+getSueldoFijo()*0.01*getNumeroVentas();
	}

}
