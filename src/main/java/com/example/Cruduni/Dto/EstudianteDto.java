package com.example.Cruduni.Dto;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Builder
public class EstudianteDto  implements Serializable {

    private String nombre;

    private Integer apellido;

}
