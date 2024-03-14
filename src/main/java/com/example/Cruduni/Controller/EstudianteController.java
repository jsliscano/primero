package com.example.Cruduni.Controller;

import com.example.Cruduni.Dto.EstudianteDto;
import com.example.Cruduni.Service.EstudianteServiceI;
import org.springframework.http.HttpStatus;// para pode dar mensajes
import com.example.Cruduni.Entity.EntityEstudiante;
import com.example.Cruduni.Service.Impl.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/estudiante")

public class EstudianteController {

    @Autowired
    private EstudianteServiceI interfasServicio;

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<EntityEstudiante> getAll() {
        return estudianteService.getEstudiante();
    }

    @PostMapping
    public ResponseEntity<String> saveUpdate(@RequestBody EntityEstudiante estudiante) {
        try {
            estudianteService.saveDrUpdate(estudiante);
            return ResponseEntity.ok("Estudiante guardado con éxito.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("No se pudo guardar el estudiante.");
        }
    }

    @PostMapping("guardarDto")
    public Object saveUpdateDto(@RequestBody EstudianteDto estudiante) {
        try {
            return interfasServicio.saveDrUpdatedt(estudiante);
            //return ResponseEntity.ok("Estudiante guardado con éxito.");
        } catch (Exception e) {
            return e.getMessage();
            //return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("No se pudo guardar el estudiante.");
        }
    }
    @DeleteMapping("/{estudianteId}")
    public ResponseEntity<String> delete(@PathVariable("estudianteId") Long estudianteId) {
        return interfasServicio.delete(estudianteId);
    }

    @GetMapping("/{estudianteId}")
    public Optional<EntityEstudiante> getById(@PathVariable("estudianteId") Long estudianteId) {
        return estudianteService.getEstidiante(estudianteId);
    }


    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }
}

