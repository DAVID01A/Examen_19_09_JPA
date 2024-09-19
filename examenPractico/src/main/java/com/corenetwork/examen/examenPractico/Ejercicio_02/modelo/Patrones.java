package com.corenetwork.examen.examenPractico.Ejercicio_02.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
@Table(name = "patrones")
public class Patrones extends Persona{
    @Id
    @Column(nullable = false)
    private String carnet;
    @Column(nullable = false)
    private String titulo;
    @Column(nullable = false)
    private int hrsNavegadas;
}
