package com.freefinder.api.controller.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.freefinder.api.modelo.Cliente;
import com.freefinder.api.repository.ClienteRepository;

public class ClienteAtualizarForm {

   @NotNull @NotBlank @Length(min = 5)
   private String nomeCompleto;
   @NotNull @NotBlank @Length(min = 5)
   private String email;

   public String getNomeCompleto() {
      return this.nomeCompleto;
   }

   public void setNomeCompleto(String nomeCompleto) {
      this.nomeCompleto = nomeCompleto;
   }

   public String getEmail() {
      return this.email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Cliente atualizar(Long id, ClienteRepository clienteRepository) {
      Cliente cliente = clienteRepository.getReferenceById(id);

      cliente.setNomeCompleto(nomeCompleto);
      cliente.setEmail(email);

      return cliente;
   }
}
