package br.com.decimal.panda.web.service;

public interface CrudService<ID, ENTITY> {
	
	void save(ENTITY entity);

}
