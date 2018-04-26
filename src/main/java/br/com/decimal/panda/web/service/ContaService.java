package br.com.decimal.panda.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.decimal.panda.web.entity.Conta;
import br.com.decimal.panda.web.mapper.ContaMapper;

@Service
public class ContaService implements CrudService<Long, Conta> {

	@Autowired
	private ContaMapper contaMapper;
	
	@Transactional
	public void salvar(Conta entity) {
		contaMapper.inserir(entity);
	}

	@Override
	@Transactional
	public Conta consultar(Long id) {
		return contaMapper.consultar(id);
	}

	@Override
	@Transactional
	public List<Conta> listar() {
		return contaMapper.listar();
	}

	@Override
	@Transactional
	public void inserir(Conta entidade) {
		contaMapper.inserir(entidade);
	}

	@Override
	@Transactional
	public void alterar(Conta entidade) {
		contaMapper.alterar(entidade);
	}

	@Override
	@Transactional
	public void remover(Long id) {
		contaMapper.remover(id);
	}

}
