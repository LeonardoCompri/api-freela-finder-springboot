package com.freefinder.api.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Habilidade {

   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nome;
   @ManyToMany(mappedBy = "habilidade")
   private Set<Freelancer> freelancer;
   @ManyToMany(mappedBy = "habilidade")
   private Set<Projeto> projeto;


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

}
