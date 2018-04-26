package br.com.decimal.panda.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.decimal.panda.web.entity.InstituicaoEnsino;
import br.com.decimal.panda.web.mapper.InstituicaoEnsinoMapper;

@Service
public class InstituicaoEnsinoService implements CrudService<Long, InstituicaoEnsino> {

	@Autowired
	private InstituicaoEnsinoMapper instituicaoEnsinoMapper;
	
	@Transactional
	public void salvar(InstituicaoEnsino entity) {
		instituicaoEnsinoMapper.inserir(entity);
	}

	@Override
	@Transactional
	public InstituicaoEnsino consultar(Long id) {
		return instituicaoEnsinoMapper.consultar(id);
	}

	@Override
	@Transactional
	public List<InstituicaoEnsino> listar() {
		return instituicaoEnsinoMapper.listar();
	}

	@Override
	@Transactional
	public void inserir(InstituicaoEnsino entidade) {
		instituicaoEnsinoMapper.inserir(entidade);
	}

	@Override
	@Transactional
	public void alterar(InstituicaoEnsino entidade) {
		instituicaoEnsinoMapper.alterar(entidade);
	}

	@Override
	@Transactional
	public void remover(Long id) {
		instituicaoEnsinoMapper.remover(id);
	}

}
