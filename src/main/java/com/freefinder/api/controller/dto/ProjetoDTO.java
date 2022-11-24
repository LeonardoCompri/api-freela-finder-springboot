package com.freefinder.api.controller.dto;

import com.freefinder.api.modelo.Projeto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProjetoDTO {

   private Long id;
   private String titulo;
   private String descricao;
   private String status;

   public ProjetoDTO(Projeto projeto) {
      this.id = projeto.getId();
      this.titulo = projeto.getTitulo();
      this.descricao = projeto.getDescricao();
      this.status = projeto.getStatus().toString();
   }

}
