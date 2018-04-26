package br.com.decimal.panda.web.entity;

import java.io.Serializable;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 5463964692559632288L;
	private Long id;
	private String usuario;
	private String senha;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
