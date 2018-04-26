package br.com.decimal.panda.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.decimal.panda.web.entity.Aluno;
import br.com.decimal.panda.web.mapper.AlunoMapper;

@Service
public class AlunoService implements CrudService<Long, Aluno> {

	@Autowired
	private AlunoMapper alunoMapper;
	
	@Transactional
	public void salvar(Aluno entity) {
		alunoMapper.inserir(entity);
	}

	@Override
	@Transactional
	public Aluno consultar(Long id) {
		return alunoMapper.consultar(id);
	}

	@Override
	@Transactional
	public List<Aluno> listar() {
		return alunoMapper.listar();
	}

	@Override
	@Transactional
	public void inserir(Aluno entidade) {
		alunoMapper.inserir(entidade);
	}

	@Override
	@Transactional
	public void alterar(Aluno entidade) {
		alunoMapper.alterar(entidade);
	}

	@Override
	@Transactional
	public void remover(Long id) {
		alunoMapper.remover(id);
	}

}
