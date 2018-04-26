package br.com.decimal.panda.web.mapper;

import java.util.List;

import br.com.decimal.panda.web.entity.Usuario;

public interface UsuarioMapper {

	public Usuario consultar(Long id);
	
	public List<Usuario> listar();
	
	public void inserir(Usuario usuario);
	
	public void alterar(Usuario usuario);
	
	public void remover(Long id);

}
