package br.com.decimal.panda.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.decimal.panda.web.entity.Usuario;
import br.com.decimal.panda.web.mapper.UsuarioMapper;

@Service
public class UsuarioService implements CrudService<Long, Usuario> {

	@Autowired
	private UsuarioMapper usuarioMapper;
	
	@Transactional
	public void salvar(Usuario entity) {
		usuarioMapper.inserir(entity);
	}

	@Override
	@Transactional
	public Usuario consultar(Long id) {
		return usuarioMapper.consultar(id);
	}

	@Override
	@Transactional
	public List<Usuario> listar() {
		return usuarioMapper.listar();
	}

	@Override
	@Transactional
	public void inserir(Usuario entidade) {
		usuarioMapper.inserir(entidade);
	}

	@Override
	@Transactional
	public void alterar(Usuario entidade) {
		usuarioMapper.alterar(entidade);
	}

	@Override
	@Transactional
	public void remover(Long id) {
		usuarioMapper.remover(id);
	}

}
