package com.freefinder.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.freefinder.api.controller.dto.ProjetoDTO;
import com.freefinder.api.enums.MappingConstraints;
import com.freefinder.api.modelo.Projeto;
import com.freefinder.api.repository.ProjetoRepository;

@RestController
public class ProjetoController {

   @Autowired
   ProjetoRepository repository;

   @GetMapping(value = MappingConstraints.Projeto.MAIN)
   public List<Projeto> getAll(){
      return repository.findAll();
   }

   @GetMapping(value = MappingConstraints.Projeto.MAIN+"/{id}")
   public ResponseEntity<ProjetoDTO> getOne(@PathVariable Long id){
      Optional<Projeto> projeto = repository.findById(id);
      if(projeto.isPresent()) {
         return ResponseEntity.ok(new ProjetoDTO(projeto.get()));
      }

      return ResponseEntity.notFound().build();
   }
}
