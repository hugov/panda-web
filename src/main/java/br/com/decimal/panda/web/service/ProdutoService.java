package br.com.decimal.panda.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.decimal.panda.web.entity.Produto;
import br.com.decimal.panda.web.mapper.ProdutoMapper;

@Service
public class ProdutoService implements CrudService<Long, Produto> {

	@Autowired
	private ProdutoMapper produtoMapper;
	
	@Transactional
	public void salvar(Produto entity) {
		produtoMapper.inserir(entity);
	}

	@Override
	@Transactional
	public Produto consultar(Long id) {
		return produtoMapper.consultar(id);
	}

	@Override
	@Transactional
	public List<Produto> listar() {
		return produtoMapper.listar();
	}

	@Override
	@Transactional
	public void inserir(Produto entidade) {
		produtoMapper.inserir(entidade);
	}

	@Override
	@Transactional
	public void alterar(Produto entidade) {
		produtoMapper.alterar(entidade);
	}

	@Override
	@Transactional
	public void remover(Long id) {
		produtoMapper.remover(id);
	}

}
