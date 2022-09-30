package com.freefinder.api.controller.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.freefinder.api.modelo.Cliente;

public class ClienteDetalhesDTO {

   private Long id;
   private String nomeCompleto;
   private String email;
   private List<ProjetoDetalheDTO> projetos;
   private LocalDateTime dataCriacao;


   public ClienteDetalhesDTO(Cliente cliente) {
      this.id = cliente.getId();
      this.nomeCompleto = cliente.getNomeCompleto();
      this.email = cliente.getEmail();
      this.dataCriacao = cliente.getDataCriacao();

      this.projetos = new ArrayList<>();
      this.projetos.addAll(cliente.getProjetos().stream().map(ProjetoDetalheDTO::new).collect(Collectors.toList()));
   }


   public Long getId() {
      return this.id;
   }


   public String getNomeCompleto() {
      return this.nomeCompleto;
   }


   public String getEmail() {
      return this.email;
   }


   public List<ProjetoDetalheDTO> getProjetos() {
      return this.projetos;
   }


   public LocalDateTime getDataCriacao() {
      return this.dataCriacao;
   }

}
