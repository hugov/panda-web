package br.com.decimal.panda.web.mapper;

import java.util.List;

import br.com.decimal.panda.web.entity.Cliente;

public interface ClienteMapper {

	public Cliente consultar(Long id);
	
	public List<Cliente> listar();
	
	public void inserir(Cliente cliente);
	
	public void alterar(Cliente cliente);
	
	public void remover(Long id);

}
