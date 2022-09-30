package com.freefinder.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freefinder.api.modelo.Freelancer;

@RestController
public class FreelancerController {

   @RequestMapping("/freelancer")
   public List<Freelancer> listar(){
      //Freelancer freelancer = new Freelancer("Leonardo Braguini", "leonardo.braguini@shx.com.br", "teste123");
      Freelancer freelancer = new Freelancer();

      return Arrays.asList(freelancer, freelancer, freelancer);
   }
}
