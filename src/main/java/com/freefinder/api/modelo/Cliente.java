package com.freefinder.api.modelo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente {

   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nomeCompleto;
   private String email;
   private String senha;
   @OneToMany(mappedBy = "cliente")
   private List<Projeto> projetos;

   private LocalDateTime dataCriacao = LocalDateTime.now();

   public Cliente() {
   }

   public Cliente(String nomeCompleto, String email, String senha) {
      this.setNomeCompleto(nomeCompleto);
      this.setEmail(email);
      this.setSenha(senha);
   }


   public Long getId() {
      return this.id;
   }


   public void setId(Long id) {
      this.id = id;
   }


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

   public List<Projeto> getProjetos() {
      return projetos;
   }


   public void setProjetos(Projeto projeto) {
      this.projetos.add(projeto);
   }


   public LocalDateTime getDataCriacao() {
      return this.dataCriacao;
   }
}
