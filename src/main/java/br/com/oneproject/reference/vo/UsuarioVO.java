package br.com.oneproject.reference.vo;

import java.io.Serializable;

public class UsuarioVO implements Serializable {

	
	private static final long serialVersionUID = -8125821830065233064L;

	private Long codigo;
	private String nome;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
