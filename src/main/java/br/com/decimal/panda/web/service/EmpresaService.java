package br.com.decimal.panda.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.decimal.panda.web.entity.Empresa;
import br.com.decimal.panda.web.mapper.EmpresaMapper;

@Service
public class EmpresaService implements CrudService<Long, Empresa> {

	@Autowired
	private EmpresaMapper empresaMapper;
	
	@Transactional
	public void salvar(Empresa entity) {
		empresaMapper.inserir(entity);
	}

	@Override
	@Transactional
	public Empresa consultar(Long id) {
		return empresaMapper.consultar(id);
	}

	@Override
	@Transactional
	public List<Empresa> listar() {
		return empresaMapper.listar();
	}

	@Override
	@Transactional
	public void inserir(Empresa entidade) {
		empresaMapper.inserir(entidade);
	}

	@Override
	@Transactional
	public void alterar(Empresa entidade) {
		empresaMapper.alterar(entidade);
	}

	@Override
	@Transactional
	public void remover(Long id) {
		empresaMapper.remover(id);
	}

}
