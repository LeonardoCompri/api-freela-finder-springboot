package com.freefinder.api.modelo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Proposta {

   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @ManyToOne
   private Freelancer freelancer;
   private Double oferta;
   private Double valorFinal;
   private String descricao;
   private Number diasEntrega;
   @ManyToOne
   private Projeto projeto;

   private LocalDateTime dataCriacao = LocalDateTime.now();

//   public Proposta(Freelancer freelancer, Double oferta, String descricao, Number dataEntrega) {
//      this.setFreelancer(freelancer);
//      this.setOferta(oferta);
//      this.setDescricao(descricao);
//      this.setDiasEntrega(dataEntrega);
//
//      Double valor_final = oferta + ((10 * oferta)/100);
//      this.setValorFinal(valor_final);
//   }


   public Long getId() {
      return this.id;
   }


   public void setId(Long id) {
      this.id = id;
   }


   public Freelancer getFreelancer() {
      return this.freelancer;
   }


   public void setFreelancer(Freelancer freelancer) {
      this.freelancer = freelancer;
   }


   public Double getOferta() {
      return this.oferta;
   }


   public void setOferta(Double oferta) {
      this.oferta = oferta;
   }


   public Double getValorFinal() {
      return this.valorFinal;
   }


   public void setValorFinal(Double valorFinal) {
      this.valorFinal = valorFinal;
   }


   public String getDescricao() {
      return this.descricao;
   }


   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }


   public Number getDiasEntrega() {
      return this.diasEntrega;
   }


   public void setDiasEntrega(Number diasEntrega) {
      this.diasEntrega = diasEntrega;
   }


   public LocalDateTime getDataCriacao() {
      return this.dataCriacao;
   }

}
