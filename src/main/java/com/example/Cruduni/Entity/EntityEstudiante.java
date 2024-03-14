package com.example.Cruduni.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

@Table(name = "tabla_estudiantes")
public class EntityEstudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long estudianteId;

    private String nombre;

    private Integer apellido;

    private String comentario;


}
