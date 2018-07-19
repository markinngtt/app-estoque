package com.gatti.estoque.domain.response;

import java.util.Date;

public class UsuarioResponse {
	
	private Long idUsuario;
	private Date dataCadastro;
	private String indSuperUsuario;
	private String usuario;
	private String senha;
	
	public UsuarioResponse(Long idUsuario, Date dataCadastro, String indSuperUsuario, String usuario, String senha) {
		super();
		this.idUsuario = idUsuario;
		this.dataCadastro = dataCadastro;
		this.indSuperUsuario = indSuperUsuario;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public UsuarioResponse() {
		
	}

	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getIndSuperUsuario() {
		return indSuperUsuario;
	}
	public void setIndSuperUsuario(String indSuperUsuario) {
		this.indSuperUsuario = indSuperUsuario;
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
