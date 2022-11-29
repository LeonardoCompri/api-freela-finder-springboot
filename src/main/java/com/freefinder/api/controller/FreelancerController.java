package com.freefinder.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.freefinder.api.controller.dto.FreelancerDTO;
import com.freefinder.api.enums.MappingConstraints;
import com.freefinder.api.modelo.Freelancer;
import com.freefinder.api.repository.FreelancerRepository;

@RestController
public class FreelancerController {

   @Autowired
   FreelancerRepository repository;

   @GetMapping(value = MappingConstraints.Freelancer.MAIN)
   public List<Freelancer> getAll(){
      return repository.findAll();
   }

   @GetMapping(value = MappingConstraints.Freelancer.MAIN+"/{id}")
   public ResponseEntity<FreelancerDTO> getOne(@PathVariable Long id) {
      Optional<Freelancer> freelancer = repository.findById(id);
      if(freelancer.isPresent()) {
         return ResponseEntity.ok(new FreelancerDTO(freelancer.get()));
      }

      return ResponseEntity.notFound().build();
   }
}
