package br.com.decimal.panda.web.entity;

import java.io.Serializable;

public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 5463964692559632288L;
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
