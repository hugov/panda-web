package br.com.decimal.panda.web.mapper;

import java.util.List;

import br.com.decimal.panda.web.entity.Aluno;

public interface AlunoMapper {

	void inserir(Aluno aluno);
	
	void alterar(Aluno aluno);
	
	void remover(Long id);
	
	Aluno consultar(Long id);
	
	List<Aluno> listar();

}
