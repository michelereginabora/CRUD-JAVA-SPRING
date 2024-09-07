# Person CRUD Project

Este projeto é uma aplicação Spring Boot que implementa operações CRUD (Create, Read, Update, Delete) para a entidade Person. Utiliza Spring Web para criar uma API RESTful, Lombok para redução de boilerplate code, e Swagger para documentação da API.

## Tecnologias Utilizadas

- Java 21+
- Spring Boot 3.3+
- Spring Web
- Spring Data JPA
- Lombok
- Swagger (SpringDoc OpenAPI)
- Maven

## Configuração do Projeto

1. Clone o repositório:
   ```
   git clone https://github.com/seu-usuario/person-crud-project.git
   ```

2. Navegue até o diretório do projeto:
   ```
   cd person-crud-project
   ```

3. Compile o projeto:
   ```
   mvn clean install
   ```

4. Execute a aplicação:
   ```
   mvn spring-boot:run
   ```

A aplicação estará disponível em `http://localhost:8080`.

## Estrutura do Projeto

```
src
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── personcrud
│   │               ├── controllers
│   │               │   └── PersonController.java
│   │               ├── models
│   │               │   └── PersonModel.java
│   │               ├── repositories
│   │               │   └── PersonRepository.java
│   │               └── PersonCrudApplication.java
│   └── resources
│       └── application.properties
```

## API Endpoints

- GET `/persons`: Retorna todas as pessoas
- GET `/persons/{id}`: Retorna uma pessoa específica por ID
- POST `/persons`: Cria uma nova pessoa
- PUT `/persons/{id}`: Atualiza uma pessoa existente
- DELETE `/persons/{id}`: Remove uma pessoa

## Documentação da API

A documentação da API está disponível através do Swagger UI. Após iniciar a aplicação, acesse:

```
http://localhost:8080/swagger-ui.html
```

## Desenvolvimento

### Pré-requisitos

- JDK 21
- Maven 3.6+

### Compilação

Para compilar o projeto, execute:

```
mvn clean install
```

### Testes

Para executar os testes, use:

```
mvn test
```

## Contribuindo

Contribuições são bem-vindas! Por favor, sinta-se à vontade para submeter um Pull Request.

## Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE.md](LICENSE.md) para detalhes.
