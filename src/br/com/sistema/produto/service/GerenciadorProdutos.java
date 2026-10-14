package br.com.sistema.produto.service;

import java.util.List;
import br.com.sistema.produto.dao.ProdutoDAO;
import br.com.sistema.produto.model.Produto;

public class GerenciadorProdutos {
    private ProdutoDAO produtoDAO = new ProdutoDAO();

    public void cadastrarProduto(String nome, double preco, int quantidade) {
        Produto produto = new Produto(null, nome, preco, quantidade);
        produtoDAO.cadastrar(produto);
    }

    public void listarProdutos() {
        List<Produto> produtos = produtoDAO.listarTodos();
        if (produtos.isEmpty()) {
            System.out.println("\n⚠️ Nenhum produto cadastrado no banco de dados.");
            return;
        }
        System.out.println("\n--- LISTA DE PRODUTOS (BANCO H2) ---");
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    public Produto buscarPorId(Long id) {
        return produtoDAO.buscarPorId(id);
    }

    public boolean atualizarProduto(Long id, String novoNome, double novoPreco, int novaQuantidade) {
        Produto produto = new Produto(id, novoNome, novoPreco, novaQuantidade);
        return produtoDAO.atualizar(produto);
    }

    public boolean excluirProduto(Long id) {
        return produtoDAO.excluir(id);
    }
}