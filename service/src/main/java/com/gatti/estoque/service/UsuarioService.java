package com.gatti.estoque.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gatti.estoque.business.ConsultaUsuarioBusiness;
import com.gatti.estoque.domain.response.UsuarioResponse;

@Service
public class UsuarioService {
	
	@Autowired
	private ConsultaUsuarioBusiness usuarioBusiness;
	
	public UsuarioResponse consultaUsuario(String usuario, String senha) throws Exception{
		return usuarioBusiness.consultaUsuario(usuario, senha);
	}

}
