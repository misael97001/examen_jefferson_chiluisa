package com.krakedev.examen_jefferson_chiluisa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen_jefferson_chiluisa.entidades.VendedorComision;

public class TestVendedorComisionJUnit {

	@Test
    public void testSueldoComision() {
        VendedorComision vc = new VendedorComision("121314125141");
        vc.setComisionPorVenta(50.0);
        vc.setNumeroVentas(5);
        assertEquals(250.0, vc.calcularSueldo());
    }
}
