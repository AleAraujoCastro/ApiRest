package com.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value="API REST Produtos")
@CrossOrigin(origins="*")
public class ProdutoResource {
	
	@Autowired
	ProdutoRepository pr;
	
	
	@GetMapping("/produtos")
	@ApiOperation(value="Retorna uma Lista de Produtos")
	public List<Produto> listaProdutos(){		
		return pr.findAll();
	}
	
	
	@GetMapping("/produto/{id}")
	@ApiOperation(value="Retorna um Produto específico")
	public Produto produtoId(@PathVariable(value="id") long id){		 
		return pr.findById(id);
	}
	
	
	@PostMapping("/produto")
	@ApiOperation(value="Adiciona um Produto na lista")
	public Produto salvarProduto(@RequestBody Produto produto) {		
		return pr.save(produto);
	}
	
	@PutMapping("/produto")
	@ApiOperation(value="Atualiza um Produto")
	public Produto atualizarProduto(@RequestBody Produto produto) {		
		return pr.save(produto);
	}
	
	@DeleteMapping("/produto/{id}")
	@ApiOperation(value="Deleta um Produto específico")
	public void detelarProduto(@RequestBody Produto produto) {		
		pr.delete(produto);
	}
	
	
	
	
	
	

}
