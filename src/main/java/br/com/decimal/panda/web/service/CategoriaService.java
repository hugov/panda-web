package br.com.decimal.panda.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.decimal.panda.web.entity.Categoria;
import br.com.decimal.panda.web.mapper.CategoriaMapper;

@Service
public class CategoriaService implements CrudService<Long, Categoria> {

	@Autowired
	private CategoriaMapper categoriaMapper;
	
	@Transactional
	public void salvar(Categoria entity) {
		categoriaMapper.inserir(entity);
	}

	@Override
	@Transactional
	public Categoria consultar(Long id) {
		return categoriaMapper.consultar(id);
	}

	@Override
	@Transactional
	public List<Categoria> listar() {
		return categoriaMapper.listar();
	}

	@Override
	@Transactional
	public void inserir(Categoria entidade) {
		categoriaMapper.inserir(entidade);
	}

	@Override
	@Transactional
	public void alterar(Categoria entidade) {
		categoriaMapper.alterar(entidade);
	}

	@Override
	@Transactional
	public void remover(Long id) {
		categoriaMapper.remover(id);
	}

}
