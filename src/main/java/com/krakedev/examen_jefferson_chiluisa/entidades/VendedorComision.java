package com.krakedev.examen_jefferson_chiluisa.entidades;

public class VendedorComision extends Vendedor{

	public VendedorComision(String cedula) {
		super(cedula);
		}

	@Override
	public double calcularSueldo() {
		return getComisionPorVenta()*getNumeroVentas();
	}
}
