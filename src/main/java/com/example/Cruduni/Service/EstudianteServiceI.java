package com.example.Cruduni.Service;

import com.example.Cruduni.Dto.EstudianteDto;
import com.example.Cruduni.Dto.ResponseDtoGenerico;
import org.springframework.http.ResponseEntity;

public interface EstudianteServiceI {

    ResponseDtoGenerico etive(EstudianteDto estudiante);
    ResponseDtoGenerico buscar(EstudianteDto estudiante);
    ResponseDtoGenerico saveDrUpdatedt(EstudianteDto estudiante);
    ResponseEntity<String> delete(Long id);
}
