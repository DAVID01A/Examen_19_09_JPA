package com.corenetwork.examen.examenPractico.Ejercicio_01.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class IvaGeneral implements IImpuestos {

    private double tasaIva;

    @Override
    public double calcularImpuesto(double precioBase) {
        return precioBase * tasaIva;

    }
}
