package br.com.decimal.panda.web.mapper;

import java.util.List;

import br.com.decimal.panda.web.entity.Empresa;

public interface EmpresaMapper {

	public Empresa consultar(Long id);
	
	public List<Empresa> listar();
	
	public void inserir(Empresa empresa);
	
	public void alterar(Empresa empresa);
	
	public void remover(Long id);

}
