package br.org.generation.Lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.Lojagames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List <Produto> findAllByTituloContainingIgnoreCase(String titulo);
	
	
	
	
	

}
