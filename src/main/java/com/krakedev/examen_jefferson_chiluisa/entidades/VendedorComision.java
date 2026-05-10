package com.krakedev.examen_jefferson_chiluisa.entidades;

public class VendedorComision extends Vendedor{



	public VendedorComision(String cedula, String tipo) {
		super(cedula, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSueldo() {
		return getComisionPorVenta()*getNumeroVentas();
	}
}
