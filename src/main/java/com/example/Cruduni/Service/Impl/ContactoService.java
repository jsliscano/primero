package com.example.Cruduni.Service.Impl;



import com.example.Cruduni.Entity.EntityContacto;
import com.example.Cruduni.Repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactoService {

    @Autowired
    ContactoRepository contactoRepository;


    public List<EntityContacto> getcontacto() {
        return contactoRepository.findAll();
    }

    public Optional<EntityContacto> getContacto(long id){

        return contactoRepository.findById(id);
    }

    public void saveDrUpdate(EntityContacto contacto){
        contactoRepository.save(contacto);
    }
    public void delete(Long id) {
        contactoRepository.deleteById(id);
    }
}

