package com.freefinder.api.controller.dto;

import java.time.LocalDateTime;

import com.freefinder.api.modelo.Proposta;

public class PropostaDTO {

   private Long id;
   private String nomeFreelancer;
   private Number diasEntrega;
   private LocalDateTime dataCriacao;


   public PropostaDTO(Proposta proposta) {
      this.id = proposta.getId();
      this.nomeFreelancer = proposta.getFreelancer().getNomeCompleto();
      this.diasEntrega = proposta.getDiasEntrega();
      this.dataCriacao = proposta.getDataCriacao();
   }


   public Long getId() {
      return this.id;
   }


   public String getNomeFreelancer() {
      return this.nomeFreelancer;
   }


   public Number getDiasEntrega() {
      return this.diasEntrega;
   }


   public LocalDateTime getDataCriacao() {
      return this.dataCriacao;
   }
}
