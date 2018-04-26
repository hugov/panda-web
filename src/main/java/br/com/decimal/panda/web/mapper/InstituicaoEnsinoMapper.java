package br.com.decimal.panda.web.mapper;

import java.util.List;

import br.com.decimal.panda.web.entity.InstituicaoEnsino;

public interface InstituicaoEnsinoMapper {

	public InstituicaoEnsino consultar(Long id);
	
	public List<InstituicaoEnsino> listar();
	
	public void inserir(InstituicaoEnsino instituicaoEnsino);
	
	public void alterar(InstituicaoEnsino instituicaoEnsino);
	
	public void remover(Long id);

}
