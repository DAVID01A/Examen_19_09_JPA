package com.corenetwork.examen.examenPractico.Ejercicio_01.presentacion;

import com.corenetwork.examen.examenPractico.Ejercicio_01.modelo.Factura;
import com.corenetwork.examen.examenPractico.Ejercicio_01.modelo.IvaGeneral;
import com.corenetwork.examen.examenPractico.Ejercicio_01.modelo.IvaSuperReducido;
import com.corenetwork.examen.examenPractico.Ejercicio_01.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class Prueba {
    public static void main(String[] args) {
            IvaGeneral ivaGeneral = new IvaGeneral(0.21);
            IvaSuperReducido ivaSuperReducido = new IvaSuperReducido(0.04);

            Producto producto1 = new Producto("Manzana", 0.5);
            Producto producto2 = new Producto("Libro", 15.0);
            Producto producto3 = new Producto("Ordenador", 1000.0);

            List<Producto> productosFactura1 = new ArrayList<>();

            productosFactura1.add(producto1);
            productosFactura1.add(producto2);

            List<Producto> productosFactura2 = new ArrayList<>();

            productosFactura2.add(producto3);

            Factura factura1 = new Factura(ivaGeneral, productosFactura1);
            Factura factura2 = new Factura(ivaSuperReducido, productosFactura2);

            System.out.println("Total de la primera factura: " + factura1.calcularTotalFactura());
            System.out.println("Total de la segunda factura: " + factura2.calcularTotalFactura());
        }
}
