package com.example.Cruduni.Repository;

import com.example.Cruduni.Entity.EntityEstudiante;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EstudianteRepository extends JpaRepository<EntityEstudiante, Long> {
   Optional<EntityEstudiante> findBynombre(String nombre);

}
