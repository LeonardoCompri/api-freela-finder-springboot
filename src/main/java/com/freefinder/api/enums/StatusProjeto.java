package com.freefinder.api.enums;


public enum StatusProjeto {
   /**
    * Projeto aprovado pela equipe para receber as propostas dos freelancers
    */
   APROVADO,

   /**
    * Assim que o projeto é cadastrado ele vai para analise para constar se as especificações do projetos estão adequadas
    */
   ANALISE,

   /**
    * Cliente analisando o projeto entregue para validar se está correto
    */
   ANALISE_ENTREGA,

   /**
    * Proposta selecionada pelo cliente, site esperando o pagamento para notificar o freelancer do liberação para o desenvolvimento
    */
   AGUARDANDO_PAGAMENTO,

   /**
    * Projeto cancelado por motivos de total responsabilidade do cliente
    */
   CANCELADO,

   /**
    * Projeto já entregue pelo freelancer, aprovado pelo cliente e pago pela equipe do site
    */
   CONCLUIDO,

   /**
    * Ocorreu um problema que as partes envolvidas não entraram em comum acordo, a equipe do site apura os fatos para decidir qual lado está com a razão
    */
   DISPUTA,

   /**
    * Projeto em desenvolvimento pelo freelancer
    */
   EM_DESENVOLVIMENTO,

   /**
    * Cliente não selecionou um freelancer no período de proposta e o projeto foi fechado
    */
   FECHADO,

   /**
    * Projeto não passou na validação da equipe do site, cliente terá que corrigir as informações
    */
   REPROVADO;
}
