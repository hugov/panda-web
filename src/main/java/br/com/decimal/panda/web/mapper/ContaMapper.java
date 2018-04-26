package br.com.decimal.panda.web.mapper;

import java.util.List;

import br.com.decimal.panda.web.entity.Conta;

public interface ContaMapper {

	public Conta consultar(Long id);
	
	public List<Conta> listar();
	
	public void inserir(Conta conta);
	
	public void alterar(Conta conta);
	
	public void remover(Long id);

}
