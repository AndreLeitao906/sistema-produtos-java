# Sistema de Cadastro de Produtos

Este é um sistema de gerenciamento de produtos desenvolvido em **Java Puro**, rodando diretamente via console (terminal) e integrado ao banco de dados relacional **H2 Database**.

O projeto adota o padrão arquitetural **DAO (Data Access Object)** para separar a lógica de negócio do acesso aos dados.

## 🚀 Funcionalidades
O sistema opera através de um menu interativo no console, permitindo:
1. **Cadastrar Produto:** Adiciona um novo item informando nome, preço e quantidade.
2. **Listar Todos os Produtos:** Exibe todos os registros salvos no banco de dados.
3. **Buscar Produto por ID:** Localiza um item específico através do seu identificador exclusivo.
4. **Atualizar Produto:** Permite modificar as informações de um produto existente.
5. **Excluir Produto:** Remove um item permanentemente do banco de dados.

## 🛠️ Tecnologias e Estrutura do Ambiente
* **Linguagem:** Java (Ambiente configurado com a JRE/JDK 25)
* **Banco de Dados:** H2 Database
* **Ambiente de Desenvolvimento (IDE):** Spring Tools Suite 4 (baseado em Eclipse)
* **Interface:** Console de texto (`java.util.Scanner`)

## 📁 Estrutura de Arquivos Principais
* `Main.java`: Classe principal contendo o menu interativo e o ponto de entrada da aplicação (`main`).
* `ConnectionFactory.java`: Responsável por estabelecer e gerenciar a conexão com o banco de dados H2.
* `ProdutoDAO.java`: Classe que executa os comandos SQL (Insert, Select, Update, Delete) no banco.
* `Produto.java`: Modelo/Entidade encapsulando os atributos do produto (ID, nome, preço, quantidade).
* `GerenciadorProdutos.java`: Responsável por intermediar as regras de negócio entre o menu e o acesso ao banco.

## 📦 Como Executar o Projeto

### Pré-requisitos
* Possuir o **JDK 25** instalado no sistema operacional.
* Possuir o driver `.jar` do banco de dados H2 adicionado ao Classpath do projeto (caso não use gerenciador de dependências).

### Execução pelo Spring Tools Suite (STS / Eclipse)
1. Importe o projeto para dentro da sua Workspace (`File` -> `Import...` -> `Existing Projects into Workspace`).
2. Localize o arquivo `Main.java` dentro do pacote `br.com.sistema.produto.app`.
3. Clique com o botão direito sobre o arquivo `Main.java`.
4. Escolha a opção **Run As** -> **Java Application**.
5. Interaja com o sistema utilizando o painel **Console** da sua IDE.

