Sistema de Cadastro de Produtos (API REST)

API RESTful desenvolvida com Spring Boot 3 e Java 21 para o gerenciamento de produtos, integrada ao banco de dados H2.

🛠️ Tecnologias Utilizadas

Java 21
Spring Boot 3.2.5
Spring Web (API REST)
Spring Data JPA (Persistência de Dados)
H2 Database (Banco de dados em memória)
Maven (Gerenciamento de dependências)

 🚀 Funcionalidades da API
A API disponibiliza endpoints para o ciclo completo de gerenciamento de produtos (CRUD):
Método               Endpoint            Descrição
GET                 /produtos            Lista todos os produtos
GET                 /produtos/{id}       Busca um produto pelo ID
POST                /produtos            Cadastra um novo produto
PUT                 /produtos/{id}       Atualiza os dados de um produto
DELETE              /produtos/{id}       Remove um produto pelo ID

📝 Exemplos de Requisições
1.Criar um Produto (POST /produtos)
Corpo da Requisição (JSON):
{
  "nome": "Notebook Gamer",
  "preco": 4500.00
}

2.Atualizar um Produto (PUT /produtos/1)
Corpo da Requisição (JSON):
{
  "nome": "Notebook Gamer Pro",
  "preco": 4800.00
}

💻 Como Executar o Projeto

Clonar o repositório:
git clone https://github.com/AndreLeitao906/sistema-produtos-java.git

Entrar na pasta do projeto:
cd sistema-produtos-spring

Executar a aplicação:
No Eclipse/Spring Tools Suite: clique com o botão direito na classe 

SistemaProdutosSpringApplication.java -> Run As -> Spring Boot App.

Pelo terminal:./mvnw spring-boot:run

Acessar a API:Endereço base: http://localhost:8080/produtos

Console do H2 (se habilitado): http://localhost:8080/h2-console

