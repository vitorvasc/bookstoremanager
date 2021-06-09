##Bookstore API Manager

O objetivo do projeto Bookstore API Manager é disponibilizar uma API para cadastro dos livros de uma livraria através de uma API REST.

O projeto foi desenvolvido em Junho de 2021 tendo como base o curso introdutório de Spring Boot criado por @rpeleias.

Durante o projeto, foram abordados os seguintes tópicos:

* Setup inicial de projeto com o Spring Boot Initialzr.
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados.
* Desenvolvimento de operações de gerenciamento de livros (Cadastro, leitura por ID e remoção de livros).
* Relação de cada uma das operações acima com o padrão arquitetural REST, e a explicação de cada um dos conceitos REST envolvidos durante o desenvolvimento do projeto.
* Desenvolvimento de testes unitários para validação das funcionalidades.
* Implantação do sistema na nuvem através do Heroku.

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/books
```

Abaixo, segue o link do projeto implantado no Heroku:

```
https://bookapi-course.herokuapp.com/swagger-ui.html
```

O link da documentação no Heroku, implementada também atraves do Swagger, está no link abaixo:

```
https://bookapi-course.herokuapp.com/swagger-ui.html
```

##Endpoints

###POST - /api/v1/books
Utilizado para inserir livros e seus autores. Exemplo de requisição:
```json
{
  "name": "Investidor Inteligente",
  "pages": 200,
  "chapters": 20,
  "isbn": "8576082675",
  "publisherName": "Harper Collins",
  "author": {
    "name": "Benjamin Graham",
    "age": 100
  }
}
```

###GET - /api/v1/books/{id}
Utilizado para obter dados de um livro de acordo com seu ID. Exemplo de resposta:
```json
{
  "id": 1,
  "name": "Investidor Inteligente",
  "pages": 200,
  "chapters": 20,
  "isbn": "8576082675",
  "publisherName": "Harper Collins",
  "author": {
    "id": 1,
    "name": "Benjamin Graham",
    "age": 100
  }
}
```

##Próximos passos
* Implementação de banco de dados relacional
* Tratamento de novos erros (Exemplo: mensagem amigável ao tentar cadastrar livros repetidos)
* Rota para atualizar e deletar um livro
* CRUD para autores