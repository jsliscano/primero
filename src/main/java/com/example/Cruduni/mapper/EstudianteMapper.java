package com.example.Cruduni.mapper;

import com.example.Cruduni.Dto.EstudianteDto;
import com.example.Cruduni.Entity.EntityEstudiante;

/**
 * Creacion de mapper Estudiante
 */
public class EstudianteMapper {

    /**
     * Metodo que nos mapea del dto a entidad
     * @param estudianteDto Dto que recibimos de estudiante
     * @return EntityEstudiante
     */
    public static EntityEstudiante dtoAEntidad(EstudianteDto estudianteDto){
        EntityEstudiante estudiante = new EntityEstudiante();
        estudiante.setNombre(estudianteDto.getNombre());
        estudiante.setApellido(estudianteDto.getApellido());
        return estudiante;
    }
}
