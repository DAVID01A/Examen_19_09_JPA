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
@Table(name = "socio")
public class Socio extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idSocio;
}
