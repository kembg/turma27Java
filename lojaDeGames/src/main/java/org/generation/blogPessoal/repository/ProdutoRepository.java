package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Categoria;
import org.generation.blogPessoal.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto>findAllByNomeContainingIgnoreCase(String nome);
	
	public List<Produto>findAllByPreco(double preco);

}
