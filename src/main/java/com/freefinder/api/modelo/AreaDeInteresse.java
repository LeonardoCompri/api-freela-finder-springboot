package com.freefinder.api.modelo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class AreaDeInteresse {

   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nome;
   @ManyToMany
   private Set<Freelancer> freelancer;
   @OneToMany(mappedBy = "setor")
   private List<SubAreaDeInteresse> subAreaDeInteresse;

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


   public Set<Freelancer> getFreelancer() {
      return this.freelancer;
   }


   public void setFreelancer(Set<Freelancer> freelancer) {
      this.freelancer = freelancer;
   }


   public List<SubAreaDeInteresse> getSubAreaDeInteresse() {
      return this.subAreaDeInteresse;
   }


   public void setSubAreaDeInteresse(List<SubAreaDeInteresse> subAreaDeInteresse) {
      this.subAreaDeInteresse = subAreaDeInteresse;
   }


   public LocalDateTime getDataCriacao() {
      return this.dataCriacao;
   }

}
