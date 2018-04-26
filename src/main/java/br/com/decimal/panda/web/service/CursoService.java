package br.com.decimal.panda.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.decimal.panda.web.entity.Curso;
import br.com.decimal.panda.web.mapper.CursoMapper;

@Service
public class CursoService implements CrudService<Long, Curso> {

	@Autowired
	private CursoMapper cursoMapper;
	
	@Transactional
	public void salvar(Curso entity) {
		cursoMapper.inserir(entity);
	}

	@Override
	@Transactional
	public Curso consultar(Long id) {
		return cursoMapper.consultar(id);
	}

	@Override
	@Transactional
	public List<Curso> listar() {
		return cursoMapper.listar();
	}

	@Override
	@Transactional
	public void inserir(Curso entidade) {
		cursoMapper.inserir(entidade);
	}

	@Override
	@Transactional
	public void alterar(Curso entidade) {
		cursoMapper.alterar(entidade);
	}

	@Override
	@Transactional
	public void remover(Long id) {
		cursoMapper.remover(id);
	}

}
