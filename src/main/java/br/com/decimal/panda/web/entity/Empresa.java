package br.com.decimal.panda.web.entity;

import java.io.Serializable;

public class Empresa implements Serializable {
	
	private static final long serialVersionUID = -7731783413330206086L;
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
