package br.com.sistema.produto.app;

import java.util.Scanner;
import br.com.sistema.produto.model.Produto;
import br.com.sistema.produto.service.GerenciadorProdutos;

public class Main {
	public static void main(String[] args) {
		br.com.sistema.produto.util.ConnectionFactory.criarTabelaSeNaoExistir();
		Scanner scanner = new Scanner(System.in);
        GerenciadorProdutos gerenciador = new GerenciadorProdutos();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=================================");
            System.out.println("   SISTEMA DE CADASTRO DE PRODUTOS");
            System.out.println("=================================");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Todos os Produtos");
            System.out.println("3 - Buscar Produto por ID");
            System.out.println("4 - Atualizar Produto");
            System.out.println("5 - Excluir Produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\n⚠️ Entrada inválida! Digite apenas números.");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("\nNome do Produto: ");
                    String nome = scanner.nextLine();
                    
                    System.out.print("Preço: ");
                    double preco = Double.parseDouble(scanner.nextLine());
                    
                    System.out.print("Quantidade: ");
                    int quantidade = Integer.parseInt(scanner.nextLine());

                    gerenciador.cadastrarProduto(nome, preco, quantidade);
                    break;

                case 2:
                    gerenciador.listarProdutos();
                    break;

                case 3:
                    System.out.print("\nDigite o ID do produto: ");
                    Long idBusca = Long.parseLong(scanner.nextLine());
                    
                    Produto p = gerenciador.buscarPorId(idBusca);
                    if (p != null) {
                        System.out.println("\n🔍 Produto encontrado:");
                        System.out.println(p);
                    } else {
                        System.out.println("\n❌ Produto não encontrado para o ID " + idBusca);
                    }
                    break;

                case 4:
                    System.out.print("\nDigite o ID do produto a ser atualizado: ");
                    Long idAtualizar = Long.parseLong(scanner.nextLine());

                    if (gerenciador.buscarPorId(idAtualizar) != null) {
                        System.out.print("Novo Nome: ");
                        String novoNome = scanner.nextLine();
                        
                        System.out.print("Novo Preço: ");
                        double novoPreco = Double.parseDouble(scanner.nextLine());
                        
                        System.out.print("Nova Quantidade: ");
                        int novaQtd = Integer.parseInt(scanner.nextLine());

                        gerenciador.atualizarProduto(idAtualizar, novoNome, novoPreco, novaQtd);
                        System.out.println("\n✅ Produto atualizado com sucesso!");
                    } else {
                        System.out.println("\n❌ Produto não encontrado para o ID " + idAtualizar);
                    }
                    break;

                case 5:
                    System.out.print("\nDigite o ID do produto a ser excluído: ");
                    Long idExcluir = Long.parseLong(scanner.nextLine());

                    if (gerenciador.excluirProduto(idExcluir)) {
                        System.out.println("\n✅ Produto excluído com sucesso!");
                    } else {
                        System.out.println("\n❌ Produto não encontrado para o ID " + idExcluir);
                    }
                    break;

                case 0:
                    System.out.println("\nEncerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("\n⚠️ Opção inválida!");
            }
        }

        scanner.close();
    }

}
