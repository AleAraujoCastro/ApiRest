package com.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.models.Produto;
import com.apirest.repository.ProdutoRepository;

@RestController
@RequestMapping("/api")
public class ProdutoResource {
	
	@Autowired
	ProdutoRepository pr;
	
	
	@GetMapping("/produtos")
	public List<Produto> listaProdutos(){		
		return pr.findAll();
	}
	
	
	@GetMapping("/produto/{id}")
	public Produto produtoId(@PathVariable(value="id") long id){		 
		return pr.findById(id);
	}
	
	
	@PostMapping("/produto")
	public Produto salvarProduto(@RequestBody Produto produto) {		
		return pr.save(produto);
	}
	
	@PutMapping("/produto")
	public Produto atualizarProduto(@RequestBody Produto produto) {		
		return pr.save(produto);
	}
	
	@DeleteMapping("/produto/{id}")
	public void detelarProduto(@RequestBody Produto produto) {		
		pr.delete(produto);
	}
	
	
	
	
	
	

}
