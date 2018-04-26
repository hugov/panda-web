package br.com.decimal.panda.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.decimal.panda.web.entity.Cliente;
import br.com.decimal.panda.web.mapper.ClienteMapper;

@Service
public class ClienteService implements CrudService<Long, Cliente> {

	@Autowired
	private ClienteMapper clienteMapper;
	
	@Transactional
	public void salvar(Cliente entity) {
		clienteMapper.inserir(entity);
	}

	@Override
	@Transactional
	public Cliente consultar(Long id) {
		return clienteMapper.consultar(id);
	}

	@Override
	@Transactional
	public List<Cliente> listar() {
		return clienteMapper.listar();
	}

	@Override
	@Transactional
	public void inserir(Cliente entidade) {
		clienteMapper.inserir(entidade);
	}

	@Override
	@Transactional
	public void alterar(Cliente entidade) {
		clienteMapper.alterar(entidade);
	}

	@Override
	@Transactional
	public void remover(Long id) {
		clienteMapper.remover(id);
	}

}
