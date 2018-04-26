package br.com.decimal.panda.web.mapper;

import java.util.List;

import br.com.decimal.panda.web.entity.Curso;

public interface CursoMapper {

	public Curso consultar(Long id);
	
	public List<Curso> listar();
	
	public void inserir(Curso curso);
	
	public void alterar(Curso curso);
	
	public void remover(Long id);

}
