# Desafio

Você é um consultor de tecnologia contratado por uma startup que está migrando seus serviços para a nuvem AWS. O CTO pediu sua ajuda para padronizar a nomenclatura das rotas de APIs REST desenvolvidas em Java com Spring Boot.

Cada rota deve seguir o padrão de design RESTful, utilizando apenas letras minúsculas e hífens para separar palavras. Além disso, o CTO deseja que todas as rotas comecem com `/api/v1/` e terminem sem barras finais.

Sua tarefa é criar um programa que, ao receber uma string representando o nome de um endpoint (por exemplo, "GetUserProfile"), converta-a para o padrão exigido (`/api/v1/get-user-profile`).

O desafio exige atenção ao uso correto de design patterns para manipulação de strings e padronização de rotas, simulando um cenário real de consultoria em APIs Java e AWS.

Implemente uma função que leia uma string representando o nome de um endpoint em formato CamelCase e retorne a rota padronizada conforme as regras acima.

**Não utilize bibliotecas externas** para manipulação de strings. Considere que a entrada sempre será um nome válido em CamelCase, sem números ou caracteres especiais.

## Entrada

Uma única string representando o nome do endpoint em CamelCase.

## Saída

Uma única string representando a rota RESTful padronizada, conforme as regras descritas.

## Exemplos

A tabela abaixo apresenta exemplos de entrada e saída:

| Entrada           | Saída                     |
| ----------------- | ------------------------- |
| GetUserProfile    | /api/v1/get-user-profile  |
| ListOrders        | /api/v1/list-orders       |
| CreateInvoice     | /api/v1/create-invoice    |
| DeleteSession     | /api/v1/delete-session    |