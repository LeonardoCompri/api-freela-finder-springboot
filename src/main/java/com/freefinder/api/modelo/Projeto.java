package com.freefinder.api.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.freefinder.api.enums.StatusProjeto;
import com.freefinder.api.enums.VisibilidadeProjeto;

@Entity
public class Projeto {

   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @ManyToOne
   private Cliente cliente;
   @ManyToOne
   private Freelancer freelancer;
   private String titulo;
   private String categoria;
   private String descricao;
   @ManyToMany
   private Set<Habilidade> habilidade;
   private LocalDate prazoPropostas;
   @Enumerated(EnumType.STRING)
   private VisibilidadeProjeto visibilidade = VisibilidadeProjeto.PUBLICO;
   @Enumerated(EnumType.STRING)
   private StatusProjeto status = StatusProjeto.ANALISE;
   @OneToMany(mappedBy = "projeto")
   private List<Proposta> propostas;

   private LocalDateTime dataCriacao = LocalDateTime.now();


   public Long getId() {
      return this.id;
   }


   public void setId(Long id) {
      this.id = id;
   }


   public Cliente getCliente() {
      return this.cliente;
   }


   public void setCliente(Cliente cliente) {
      this.cliente = cliente;
   }


   public Freelancer getFreelancer() {
      return this.freelancer;
   }


   public void setFreelancer(Freelancer freelancer) {
      this.freelancer = freelancer;
   }


   public String getTitulo() {
      return this.titulo;
   }


   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }


   public String getCategoria() {
      return this.categoria;
   }


   public void setCategoria(String categoria) {
      this.categoria = categoria;
   }


   public String getDescricao() {
      return this.descricao;
   }


   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }


   public Set<Habilidade> getHabilidade() {
      return this.habilidade;
   }


   public void setHabilidade(Set<Habilidade> habilidade) {
      this.habilidade = habilidade;
   }


   public LocalDate getPrazoPropostas() {
      return this.prazoPropostas;
   }


   public void setPrazoPropostas(LocalDate prazoPropostas) {
      this.prazoPropostas = prazoPropostas;
   }


   public VisibilidadeProjeto getVisibilidade() {
      return this.visibilidade;
   }


   public void setVisibilidade(VisibilidadeProjeto visibilidade) {
      this.visibilidade = visibilidade;
   }


   public StatusProjeto getStatus() {
      return this.status;
   }


   public void setStatus(StatusProjeto status) {
      this.status = status;
   }


   public List<Proposta> getPropostas() {
      return this.propostas;
   }


   public void setPropostas(List<Proposta> propostas) {
      this.propostas = propostas;
   }


   public LocalDateTime getDataCriacao() {
      return this.dataCriacao;
   }

}
