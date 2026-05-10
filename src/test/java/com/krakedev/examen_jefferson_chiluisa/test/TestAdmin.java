package com.krakedev.examen_jefferson_chiluisa.test;

import com.krakedev.examen_jefferson_chiluisa.entidades.AdminVentas;
import com.krakedev.examen_jefferson_chiluisa.entidades.Vendedor;
import com.krakedev.examen_jefferson_chiluisa.entidades.VendedorComision;
import com.krakedev.examen_jefferson_chiluisa.entidades.VendedorMixto;

public class TestAdmin {
	    public static void main(String[] args) {

	    	AdminVentas admin = new AdminVentas();

	        Vendedor v1 = new Vendedor("1711111111", "V");
	        VendedorComision v2 = new VendedorComision("1722222222", "C");
	        VendedorMixto v3 = new VendedorMixto("1733333333", "M");

	        v1.setSueldoFijo(450.0);
	        
	        v2.setComisionPorVenta(20.0);
	        v2.setNumeroVentas(15);

	        v3.setSueldoFijo(800.0);
	        v3.setNumeroVentas(10); 

	        admin.agregar(v1);
	        admin.agregar(v2);
	        admin.agregar(v3);

	        System.out.println("--- Resultados de Cálculo de Sueldos ---");
	        
	        Double sueldoV1 = admin.calcularSueldo("1711111111");
	        System.out.println("Sueldo Vendedor Normal: " + sueldoV1);

	        Double sueldoV2 = admin.calcularSueldo("1722222222");
	        System.out.println("Sueldo Vendedor Comisión: " + sueldoV2);

	        Double sueldoV3 = admin.calcularSueldo("1733333333");
	        System.out.println("Sueldo Vendedor Mixto: " + sueldoV3);

	        System.out.println("\n--- Prueba con cédula inexistente ---");
	        double sueldoInexistente = admin.calcularSueldo("9999999999");
	        System.out.println("Resultado para cédula 9999999999: " + sueldoInexistente);
	   
	       System.out.println(); 
	        
	    }
	}