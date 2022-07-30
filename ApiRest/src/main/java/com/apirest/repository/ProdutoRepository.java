package com.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	Produto findById (long id);

}
