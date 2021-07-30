package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria>findAllByDescricaoContainingIgnoreCase(String descricao);
		
	
}
