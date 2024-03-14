package com.example.Cruduni.Entity;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "tabla_contacto")
public class EntityContacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long contactoId;

    @Column(name = "Telefono", nullable = false)
    private String telefono;

    @Column(name = "Ciudad", nullable = false)
    private String ciudad;

    @Column(name = "Direccion", nullable = false)
    private String direccion;


}
