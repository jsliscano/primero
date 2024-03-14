package com.example.Cruduni.Repository;


import com.example.Cruduni.Entity.EntityContacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository<EntityContacto, Long> {

}
