package com.krakedev.examen_jefferson_chiluisa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen_jefferson_chiluisa.entidades.VendedorMixto;

public class TestVendedorMixtoJUnit {
	@Test
    public void testSueldoMixto() {
        VendedorMixto vm = new VendedorMixto("456", "M");
        vm.setSueldoFijo(1000.0);
        vm.setNumeroVentas(10);
        // 1000 + (1000 * 0.01 * 10) = 1100
        assertEquals(1100.0, vm.calcularSueldo());
    }
}
