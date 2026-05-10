package com.krakedev.examen_jefferson_chiluisa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen_jefferson_chiluisa.entidades.Vendedor;

public class TestVendedorJUnit {

	@Test
    public void testCalcularSueldo() {
       Vendedor vendedor = new Vendedor("1725544332");
        
        double sueldoEsperado = 525.50;
        vendedor.setSueldoFijo(sueldoEsperado);
        
        double sueldoObtenido = vendedor.calcularSueldo();
        
        assertEquals(sueldoEsperado, sueldoObtenido, "El sueldo calculado debe ser igual al sueldo fijo");
    }
}