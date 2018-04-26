package br.com.decimal.panda.web.mapper;

import java.util.List;

import br.com.decimal.panda.web.entity.Categoria;

public interface CategoriaMapper {

	void inserir(Categoria categoria);
	
	void alterar(Categoria categoria);
	
	void remover(Long id);
	
	Categoria consultar(Long id);
	
	List<Categoria> listar();

}
