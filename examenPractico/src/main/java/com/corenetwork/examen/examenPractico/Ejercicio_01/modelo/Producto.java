package com.corenetwork.examen.examenPractico.Ejercicio_01.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Producto {
    private String nombre;
    private double precio;

    public double calcularImpuesto(double precioBase) {
        return precioBase*0.21;
    }
}
