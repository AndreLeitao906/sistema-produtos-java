package br.com.sistema.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.sistema.produto.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}