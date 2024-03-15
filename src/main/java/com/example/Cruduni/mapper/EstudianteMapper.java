package com.example.Cruduni.mapper;

import com.example.Cruduni.Dto.EstudianteDto;
import com.example.Cruduni.Entity.EntityEstudiante;
import org.springframework.stereotype.Service;

/**
 * Creacion de mapper Estudiante
 */
@Service
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
    public EstudianteDto dtoAentidadv2 (EntityEstudiante entidad){
        return EstudianteDto.builder()
                .nombre(entidad.getNombre())
                .apellido(entidad.getApellido())
                .build();
    }
}
