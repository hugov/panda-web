package br.com.decimal.panda.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.decimal.panda.web.entity.Categoria;
import br.com.decimal.panda.web.mapper.CategoriaMapper;

@Service
public class CategoriaService { //implements CrudService<Long, Categoria> {

	@Autowired
	private CategoriaMapper categoriaMapper;
	
	@Transactional
	public void salvar(Categoria entity) {
		categoriaMapper.inserir(entity);
	}

	@Transactional
	public Categoria consultar(Long id) {
		return categoriaMapper.consultar(id);
	}

	@Transactional
	public List<Categoria> listar() {
		return categoriaMapper.listar();
	}

	@Transactional
	public void inserir(Categoria entidade) {
		categoriaMapper.inserir(entidade);
	}

	@Transactional
	public void alterar(Categoria entidade) {
		categoriaMapper.alterar(entidade);
	}

	@Transactional
	public void remover(Long id) {
		categoriaMapper.remover(id);
	}

}
