# API GraphQL com Spring Boot

## Introdução

Este é um guia para a API GraphQL construída utilizando Spring Boot como framework e GraphQL como adaptador de consumo e manipulação de dados.

## Tecnologias Utilizadas

- **Spring Boot**: Framework para construção de aplicações Java.
- **GraphQL**: Linguagem de consulta e manipulação de dados.
- **H2 Database**: Banco de dados em memória para desenvolvimento.

## Pré-requisitos

Antes de começar, certifique-se de ter instalado em sua máquina:

- Java Development Kit (JDK)
- Maven

## Operações Suportadas

A API suporta as seguintes operações:

### Consultas (Query)

- **findCategoryById(id: ID): Category**: Consulta uma categoria pelo seu ID.
- **findAllProduct: [Product]**: Retorna todos os produtos cadastrados.

### Mutações (Mutation)

- **createCategory(category: CategoryDTO): Category**: Cria uma nova categoria.
- **createProduct(product: ProductDTO): Product**: Cria um novo produto.

## Schema GraphQL

```graphql
type Mutation {
   createCategory(category: CategoryDTO): Category
   createProduct(product: ProductDTO): Product
}

type Query {
    findCategoryById(id: ID): Category
    findAllProduct: [Product]
}

type Category {
    name: String
    id: ID!
}

type Product {
    id: ID!
    name: String
    price: Float
    category: Category
}

input CategoryDTO {
    name: String!
}

input ProductDTO {
    name: String!
    price: Float!
    categoryId: ID!
}
