package br.com.decimal.panda.web.mapper;

import java.util.List;

import br.com.decimal.panda.web.entity.Aluno;

public interface AlunoMapper {

	public Aluno consultar(Long id);
	
	public List<Aluno> listar();
	
	public void inserir(Aluno aluno);
	
	public void alterar(Aluno aluno);
	
	public void remover(Long id);

}
