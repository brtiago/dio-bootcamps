# Desafio

Você é um consultor de tecnologia contratado por uma startup que está migrando seus serviços para a nuvem AWS. O CTO pediu sua ajuda para padronizar a nomenclatura das rotas de APIs REST desenvolvidas em Java com Spring Boot.

Para garantir a escalabilidade e a manutenção do sistema, todas as rotas devem seguir o padrão: **o nome do recurso no plural, seguido de uma ação (como "listar", "criar", "atualizar" ou "deletar"), separados por um traço**. Por exemplo, `"clientes-listar"` ou `"produtos-criar"`.

Sua tarefa é criar um programa que, ao receber uma string representando uma rota de API, valide se ela segue o padrão estabelecido.

- Caso a rota seja válida, retorne **`"valido"`**.
- Caso contrário, retorne **`"invalido"`**.

O programa deve ser implementado **sem bibliotecas externas**, apenas com recursos padrão da linguagem.

Considere que:
- O nome do recurso deve conter apenas letras minúsculas e estar no plural.
- A ação deve ser uma das quatro permitidas: `"listar"`, `"criar"`, `"atualizar"` ou `"deletar"`.
- Não há espaços antes ou depois do traço.

## Entrada

Uma única string representando a rota da API a ser validada.

## Saída

Imprima `"valido"` se a rota segue o padrão especificado, ou `"invalido"` caso contrário.

## Exemplos

A tabela abaixo apresenta exemplos de entrada e saída:

| Entrada               | Saída     |
|-----------------------|-----------|
| clientes-listar       | valido    |
| produto-criar         | invalido  |
| usuarios-deletar      | valido    |
| clientes-remover      | invalido  |