package br.com.decimal.panda.web.entity;

import java.io.Serializable;

public class Conta implements Serializable {

	private static final long serialVersionUID = -2964832522476177911L;
	
	private Long id;
	private Empresa empresa;
	private Long situacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Long getSituacao() {
		return situacao;
	}

	public void setSituacao(Long situacao) {
		this.situacao = situacao;
	}

}
