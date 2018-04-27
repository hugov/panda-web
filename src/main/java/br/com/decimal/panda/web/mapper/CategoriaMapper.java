package br.com.decimal.panda.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.decimal.panda.web.entity.Categoria;

@Component
public interface CategoriaMapper {

	public Categoria consultar(Long id);
	
	public List<Categoria> listar();
	
	public void inserir(Categoria categoria);
	
	public void alterar(Categoria categoria);
	
	public void remover(Long id);

}
