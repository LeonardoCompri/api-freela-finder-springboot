package com.freefinder.api.controller.dto;


import java.time.LocalDate;

import com.freefinder.api.modelo.Freelancer;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FreelancerDTO {

   private Long   id;
   private String nomeCompleto;
   private String email;
   private LocalDate dataNascimento;

   public FreelancerDTO(Freelancer freelancer) {
      this.id = freelancer.getId();
      this.nomeCompleto = freelancer.getNomeCompleto();
      this.email = freelancer.getEmail();
      this.dataNascimento = freelancer.getDataNascimento();
   }

}
