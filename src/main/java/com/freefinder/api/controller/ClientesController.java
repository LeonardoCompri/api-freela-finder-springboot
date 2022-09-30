package com.freefinder.api.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.freefinder.api.controller.dto.ClienteDTO;
import com.freefinder.api.controller.dto.ClienteDetalhesDTO;
import com.freefinder.api.controller.form.ClienteAtualizarForm;
import com.freefinder.api.controller.form.ClienteInserirForm;
import com.freefinder.api.modelo.Cliente;
import com.freefinder.api.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

   @Autowired
   private ClienteRepository clienteRepository;

   @GetMapping
   public List<ClienteDTO> lista(){
      List<Cliente> clientes = clienteRepository.findAll();

      return ClienteDTO.converter(clientes);
   }

   @GetMapping("/{id}")
   public ResponseEntity<ClienteDetalhesDTO> detalhes(@PathVariable Long id) {
      Optional<Cliente> cliente = clienteRepository.findById(id);
      if(cliente.isPresent()) {
         return ResponseEntity.ok(new ClienteDetalhesDTO(cliente.get()));
      }

      return ResponseEntity.notFound().build();
   }

   @PostMapping
   @Transactional
   public ResponseEntity<ClienteDTO> cadastrar(@RequestBody @Valid ClienteInserirForm form, UriComponentsBuilder uriBuilder) {
      Cliente cliente = form.converter();
      clienteRepository.save(cliente);

      URI uri = uriBuilder.path("/clientes/{id}").buildAndExpand(cliente.getId()).toUri();
      return ResponseEntity.created(uri).body(new ClienteDTO(cliente));
   }

   @PutMapping("/{id}")
   @Transactional
   public ResponseEntity<ClienteDTO> atualizar(@PathVariable Long id, @RequestBody @Valid ClienteAtualizarForm form) {
      Optional<Cliente> optional = clienteRepository.findById(id);
      if(optional.isPresent()) {
         Cliente cliente = form.atualizar(id, clienteRepository);
         return ResponseEntity.ok(new ClienteDTO(cliente));
      }

      return ResponseEntity.notFound().build();
   }

   @DeleteMapping("/{id}")
   @Transactional
   public ResponseEntity<?> remover(@PathVariable Long id){
      Optional<Cliente> optional = clienteRepository.findById(id);
      if(optional.isPresent()) {
         clienteRepository.deleteById(id);
         return ResponseEntity.ok().build();
      }

      return ResponseEntity.notFound().build();
   }
}
