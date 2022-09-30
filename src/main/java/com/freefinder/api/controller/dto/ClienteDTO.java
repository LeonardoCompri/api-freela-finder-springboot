package com.freefinder.api.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.freefinder.api.modelo.Cliente;

public class ClienteDTO {

   private Long   id;
   private String nomeCompleto;
   private String email;

   public ClienteDTO(Cliente cliente) {
      this.id = cliente.getId();
      this.nomeCompleto = cliente.getNomeCompleto();
      this.email = cliente.getEmail();
   }


   public Long getId() {
      return this.id;
   }


   public String getNomeCompleto() {
      return this.nomeCompleto;
   }


   public String getEmail() {
      return this.email;
   }


   public static List<ClienteDTO> converter(List<Cliente> clientes) {
      return clientes.stream().map(ClienteDTO::new).collect(Collectors.toList());
   }


}
