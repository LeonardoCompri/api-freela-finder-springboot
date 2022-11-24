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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
