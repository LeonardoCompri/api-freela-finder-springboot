package com.freefinder.api.controller.dto;


public class ErroFormDTO {

   private String campo;
   private String erro;


   public ErroFormDTO(String campo, String erro) {
      this.campo = campo;
      this.erro = erro;
   }


   public String getCampo() {
      return this.campo;
   }


   public String getErro() {
      return this.erro;
   }

}
