package br.com.decimal.panda.web.mapper;

import java.util.List;

import br.com.decimal.panda.web.entity.Produto;

public interface ProdutoMapper {

	public Produto consultar(Long id);
	
	public List<Produto> listar();
	
	public void inserir(Produto produto);
	
	public void alterar(Produto produto);
	
	public void remover(Long id);

}
