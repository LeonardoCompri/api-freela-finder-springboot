package com.freefinder.api.controller.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.freefinder.api.modelo.Cliente;

public class ClienteInserirForm {

   @NotNull @NotBlank @Length(min = 5)
   private String nomeCompleto;
   @NotNull @NotBlank @Length(min = 5)
   private String email;
   @NotNull @NotBlank @Length(min = 5)
   private String senha;

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

   public String getSenha() {
      return this.senha;
   }

   public void setSenha(String senha) {
      this.senha = senha;
   }

   public Cliente converter() {
      return new Cliente(this.getNomeCompleto(), this.getEmail(), this.getSenha());
   }

}
