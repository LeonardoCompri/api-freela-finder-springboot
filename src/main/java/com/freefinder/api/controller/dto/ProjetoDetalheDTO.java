package com.freefinder.api.controller.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.freefinder.api.enums.StatusProjeto;
import com.freefinder.api.enums.VisibilidadeProjeto;
import com.freefinder.api.modelo.Projeto;

public class ProjetoDetalheDTO {

   private Long id;
   private String titulo;
   private String categoria;
   private String descricao;
   private LocalDate prazoPropostas;
   private VisibilidadeProjeto visibilidade;
   private StatusProjeto status;
   private List<PropostaDTO> propostas;

   private LocalDateTime dataCriacao;

   public ProjetoDetalheDTO(Projeto projeto) {
      this.id = projeto.getId();
      this.titulo = projeto.getTitulo();
      this.categoria = projeto.getCategoria();
      this.descricao = projeto.getDescricao();
      this.prazoPropostas = projeto.getPrazoPropostas();
      this.visibilidade = projeto.getVisibilidade();
      this.status = projeto.getStatus();
      this.dataCriacao = projeto.getDataCriacao();

      this.propostas = new ArrayList<>();
      this.propostas.addAll(projeto.getPropostas().stream().map(PropostaDTO::new).collect(Collectors.toList()));
   }


   public Long getId() {
      return this.id;
   }


   public String getTitulo() {
      return this.titulo;
   }


   public String getCategoria() {
      return this.categoria;
   }


   public String getDescricao() {
      return this.descricao;
   }


   public LocalDate getPrazoPropostas() {
      return this.prazoPropostas;
   }


   public VisibilidadeProjeto getVisibilidade() {
      return this.visibilidade;
   }


   public StatusProjeto getStatus() {
      return this.status;
   }


   public List<PropostaDTO> getPropostas() {
      return this.propostas;
   }


   public LocalDateTime getDataCriacao() {
      return this.dataCriacao;
   }

}
