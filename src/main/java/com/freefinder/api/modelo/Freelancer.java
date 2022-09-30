package com.freefinder.api.modelo;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Freelancer {

   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nomeCompleto;
   private String email;
   private String senha;
   private Date dataNascimento;
   private String cpf;
   private String descricao;
   @ManyToMany
   private Set<AreaDeInteresse> areasDeInteresse;
   @ManyToMany
   private Set<Habilidade> habilidade;
   @OneToMany(mappedBy = "freelancer")
   private List<Projeto> projetos;
   @OneToMany(mappedBy = "freelancer")
   private List<Proposta> propostas;

   private LocalDateTime dataCriacao = LocalDateTime.now();


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


   public Date getDataNascimento() {
      return this.dataNascimento;
   }


   public void setDataNascimento(Date dataNascimento) {
      this.dataNascimento = dataNascimento;
   }


   public String getCpf() {
      return this.cpf;
   }


   public void setCpf(String cpf) {
      this.cpf = cpf;
   }


   public String getDescricao() {
      return this.descricao;
   }


   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }


   public Set<AreaDeInteresse> getAreasDeInteresse() {
      return this.areasDeInteresse;
   }


   public void setAreasDeInteresse(Set<AreaDeInteresse> areasDeInteresse) {
      this.areasDeInteresse = areasDeInteresse;
   }


   public Set<Habilidade> getHabilidade() {
      return this.habilidade;
   }


   public void setHabilidade(Set<Habilidade> habilidade) {
      this.habilidade = habilidade;
   }

   public LocalDateTime getDataCriacao() {
      return this.dataCriacao;
   }
}
