package com.krakedev.examen_jefferson_chiluisa.entidades;

import java.util.ArrayList;

public class AdminVentas {
	
	private ArrayList<Vendedor> vendedores = new ArrayList<>();

    public void agregar(Vendedor v) {
        vendedores.add(v);
    }

    public double calcularSueldo(String cedula) {
        // Búsqueda con for clásico
        for (int i = 0; i < vendedores.size(); i++) {
            Vendedor v = vendedores.get(i);
            if (v.getCedula().equals(cedula)) {
                return v.calcularSueldo();
            }
        }
		return 0;
    }
}
