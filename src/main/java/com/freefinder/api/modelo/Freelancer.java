package com.freefinder.api.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Freelancer {

   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nomeCompleto;
   private String email;
   private String senha;
   private LocalDate dataNascimento;
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
}
