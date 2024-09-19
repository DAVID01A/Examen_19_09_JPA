package com.corenetwork.examen.examenPractico.Ejercicio_02.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
@Table(name = "barco")
public class Barco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private int idSocio;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String matricula;
    @Column(nullable = false)
    private String amarre;
    @Column(nullable = false)
    private double cuota;
    @ManyToOne
    @JoinColumn(name = "idSocio", referencedColumnName = "dni")
    private Persona propietario;

}
