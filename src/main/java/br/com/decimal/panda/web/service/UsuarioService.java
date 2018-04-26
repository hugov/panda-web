package br.com.decimal.panda.web.service;

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
	public void save(Usuario entity) {
		usuarioMapper.inserir(entity);
	}

}
