package com.freefinder.api.modelo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SubAreaDeInteresse {

   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nome;
   @ManyToOne
   private AreaDeInteresse setor;

   private LocalDateTime dataCriacao = LocalDateTime.now();


   public Long getId() {
      return this.id;
   }


   public void setId(Long id) {
      this.id = id;
   }


   public String getNome() {
      return this.nome;
   }


   public void setNome(String nome) {
      this.nome = nome;
   }


   public AreaDeInteresse getSetor() {
      return this.setor;
   }


   public void setSetor(AreaDeInteresse setor) {
      this.setor = setor;
   }


   public LocalDateTime getDataCriacao() {
      return this.dataCriacao;
   }

}
