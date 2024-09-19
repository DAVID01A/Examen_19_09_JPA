package com.corenetwork.examen.examenPractico.Ejercicio_02.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
@Table(name = "viajar")
public class Viajar {

    private String destino;
    private LocalDate fSalida;
    private LocalDateTime hSalida;
}
