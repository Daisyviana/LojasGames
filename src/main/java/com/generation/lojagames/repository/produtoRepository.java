package com.generation.lojagames.repository;


import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojagames.model.Produto;

public interface produtoRepository extends JpaRepository<Produto, Long>{
	
	List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);
	
	List<Produto> findAllByPrecoGreaterThanEqualOrderByPreco(BigDecimal preco);
	
	List<Produto> findAllByPrecoLessThanEqualOrderByPrecoDesc(BigDecimal preco);

}