package com.generation.lojagamer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojagamer.model.Produtos;

public interface ProdutosRepository extends JpaRepository <Produtos, Long> {

	public List <Produtos> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
