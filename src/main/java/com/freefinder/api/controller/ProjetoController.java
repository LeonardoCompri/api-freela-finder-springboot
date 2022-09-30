package com.freefinder.api.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freefinder.api.modelo.Cliente;
import com.freefinder.api.modelo.Freelancer;
import com.freefinder.api.modelo.Projeto;
import com.freefinder.api.modelo.Proposta;

@RestController
public class ProjetoController {

   @RequestMapping("/projeto")
   public List<Projeto> lista(){
//      Cliente cliente = new Cliente("Leonardo Braguini", "leonardo.braguini@shx.com.br", "Teste123");
//
//      Projeto projeto = new Projeto(cliente, "Criação de logo", "Design e criação", "Criar uma logo vetorizada", LocalDate.parse("2022-09-30", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//      Projeto projeto1 = new Projeto(cliente, "Criação SPA", "Desenvolvimento", "Criar uma single page application", LocalDate.parse("2022-10-30", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//
//      Freelancer freelancer = new Freelancer("Leonardo Compri", "leonardocompri46@gmail.com", "123Teste");
//
//      Proposta proposta1 = new Proposta(freelancer, 100.00, "A logo será feita no InkScape", 15);
//      projeto.setPropostas(Arrays.asList(proposta1));
//
//      Proposta proposta2 = new Proposta(freelancer, 1000.00, "Será desenvolvido em Angular", 45);
//      Proposta proposta3 = new Proposta(freelancer, 1200.00, "Usarei React para desenvolver", 40);
//
//      projeto1.setPropostas(Arrays.asList(proposta2, proposta3));

      Projeto projeto = new Projeto();
      Projeto projeto1 = new Projeto();

      return Arrays.asList(projeto, projeto1);
   }
}
