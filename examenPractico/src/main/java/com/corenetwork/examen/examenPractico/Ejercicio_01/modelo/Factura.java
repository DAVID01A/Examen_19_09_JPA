package com.corenetwork.examen.examenPractico.Ejercicio_01.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
@AllArgsConstructor
@RequiredArgsConstructor
@Data

public class Factura {
    private IImpuestos iImpuestos;
    private List<Producto> productos;
    public double calcularTotalFactura() {
        double total = 0.0;
        for (Producto producto : productos) {
            double precioConImpuesto = producto.getPrecio() + producto.calcularImpuesto(producto.getPrecio());
            total += precioConImpuesto;
        }
        return total;
    }
}
