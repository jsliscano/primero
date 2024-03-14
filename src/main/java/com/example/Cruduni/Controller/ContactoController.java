package com.example.Cruduni.Controller;

import com.example.Cruduni.Entity.EntityContacto;
import com.example.Cruduni.Service.Impl.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(path = "api/v1/contacto")

    public class ContactoController {
        @Autowired
        private ContactoService contactoService;

        @GetMapping
        public List<EntityContacto> getAll() {
            return contactoService.getcontacto();
        }

        @PostMapping
        public void saveUpdate(@RequestBody EntityContacto contacto) {
            contactoService.saveDrUpdate(contacto);
        }

        @DeleteMapping("/{contactoId}")
        public void saveUpdate (@PathVariable("contactoId") Long contactoId) {
            contactoService.delete(contactoId);
        }
        @GetMapping("/{contactoId}")
        public Optional<EntityContacto> getById(@PathVariable("contactoId") Long contactoId) {
            return contactoService.getContacto(contactoId);

        }

        public ContactoController(ContactoService contactoService) {
            this.contactoService = contactoService;
        }
    }


