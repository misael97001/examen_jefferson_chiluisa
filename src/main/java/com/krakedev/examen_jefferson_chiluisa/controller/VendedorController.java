package com.krakedev.examen_jefferson_chiluisa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.examen_jefferson_chiluisa.entidades.AdminVentas;
import com.krakedev.examen_jefferson_chiluisa.entidades.Vendedor;
import com.krakedev.examen_jefferson_chiluisa.entidades.VendedorComision;
import com.krakedev.examen_jefferson_chiluisa.entidades.VendedorMixto;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {
	
	 private AdminVentas admin = new AdminVentas();

    @PostMapping("/agregar")
    public void agregarVendedor(@RequestBody Vendedor v) {
        Vendedor nuevo;
      
        if (v.getTipo().equals("C")) {
            nuevo = new VendedorComision(v.getCedula(), v.getTipo());
        } else if (v.getTipo().equals("M")) {
            nuevo = new VendedorMixto(v.getCedula(), v.getTipo());
        } else {
            nuevo = new Vendedor(v.getCedula(), v.getTipo());
        }
        
        nuevo.setNumeroVentas(v.getNumeroVentas());
        nuevo.setSueldoFijo(v.getSueldoFijo());
        nuevo.setComisionPorVenta(v.getComisionPorVenta());
        
        admin.agregar(nuevo);
    }

    @GetMapping("/calcular/{cedula}")
    public double calcularSueldoVendedor(@PathVariable String cedula) {
        return admin.calcularSueldo(cedula);
    }
}