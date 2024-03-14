package com.example.Cruduni.Service.Impl;

import com.example.Cruduni.Dto.EstudianteDto;
import com.example.Cruduni.Dto.ResponseDtoGenerico;
import com.example.Cruduni.Entity.EntityContacto;
import com.example.Cruduni.Entity.EntityEstudiante;
import com.example.Cruduni.Repository.ContactoRepository;
import com.example.Cruduni.Repository.EstudianteRepository;
import com.example.Cruduni.Service.EstudianteServiceI;
import com.example.Cruduni.contantes.Constantes;
import com.example.Cruduni.mapper.EstudianteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService implements EstudianteServiceI {
    @Autowired
    EstudianteRepository estudianteRepository;

    @Autowired
    ContactoRepository contactoRepository;

    public List<EntityEstudiante> getEstudiante() {
        return estudianteRepository.findAll();
    }

    public Optional<EntityEstudiante> getEstidiante(long id) {

        return estudianteRepository.findById(id);
    }

    public void saveDrUpdate(EntityEstudiante estudiante) {

        estudianteRepository.save(estudiante);
    }


    @Override
    public ResponseDtoGenerico etive(EstudianteDto estudiante) {
        return null;
    }

    @Override
    public ResponseDtoGenerico buscar(EstudianteDto estudiante) {
        return null;
    }

    @Override
    public ResponseDtoGenerico saveDrUpdatedt(EstudianteDto estudiante) {
        EntityEstudiante estudiante1 = EstudianteMapper.dtoAEntidad(estudiante);
        estudianteRepository.save(estudiante1);
        ResponseDtoGenerico responseDtoGenerico =
                ResponseDtoGenerico
                        .builder()
                        .code(Constantes.respuestaExitopsa200)
                        .mensaje(Constantes.guardoBien)
                        .estudianteDto(estudiante)
                        .build();
        return responseDtoGenerico;
    }

    @Override
    public ResponseEntity<String> delete(Long id) {
        try{
            Optional<EntityEstudiante> estudiante = estudianteRepository.findById(id);
            if (estudiante.isPresent()) {
                estudianteRepository.deleteById(id);
                return ResponseEntity.ok(Constantes.respuestaExitopsa);
            } else {
                return ResponseEntity.ok(Constantes.respuestaFallida);
            }
        }catch (Exception e){
            return null;
        }
    }
}
