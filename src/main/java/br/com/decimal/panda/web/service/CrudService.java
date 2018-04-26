package br.com.decimal.panda.web.service;

import java.util.List;

public interface CrudService<ID, ENTIDADE> {
	
	public ENTIDADE consultar(ID id);
	
	public List<ENTIDADE> listar();
	
	public void inserir(ENTIDADE entidade);
	
	public void alterar(ENTIDADE entidade);
	
	public void remover(ID id);

}
