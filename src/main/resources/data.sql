INSERT INTO CLIENTE(NOME_COMPLETO, EMAIL, SENHA, DATA_CRIACAO) VALUES ('Teste', 'teste', 'teste', NOW());

INSERT INTO PROJETO(CATEGORIA, DATA_CRIACAO, DESCRICAO, PRAZO_PROPOSTAS, STATUS, TITULO, VISIBILIDADE, CLIENTE_ID, FREELANCER_ID) VALUES ('DESENVOLVIMENTO', NOW(), 'DESCRICAO', '2022-12-30', 'ANALISE', 'Título', 'PUBLICO', NULL, NULL);
INSERT INTO PROJETO(CATEGORIA, DATA_CRIACAO, DESCRICAO, PRAZO_PROPOSTAS, STATUS, TITULO, VISIBILIDADE, CLIENTE_ID, FREELANCER_ID) VALUES ('DESENVOLVIMENTO', NOW(), 'AQUI TEM DESCRICAO', '2022-12-28', 'ANALISE', 'Projeto web', 'PUBLICO', NULL, NULL);
INSERT INTO PROJETO(CATEGORIA, DATA_CRIACAO, DESCRICAO, PRAZO_PROPOSTAS, STATUS, TITULO, VISIBILIDADE, CLIENTE_ID, FREELANCER_ID) VALUES ('DESENVOLVIMENTO', NOW(), 'PRECISO DE UM SITE', '2022-12-30', 'ANALISE', 'Site Projeto', 'PUBLICO', NULL, NULL);