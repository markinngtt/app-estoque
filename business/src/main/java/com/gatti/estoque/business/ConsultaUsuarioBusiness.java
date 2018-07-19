package com.gatti.estoque.business;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gatti.estoque.domain.entity.Usuario;
import com.gatti.estoque.domain.response.UsuarioResponse;
import com.gatti.estoque.persist.repository.UsuarioRepository;

@Component
public class ConsultaUsuarioBusiness {

	private static final Logger LOG = Logger.getLogger(ConsultaUsuarioBusiness.class);
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public UsuarioResponse consultaUsuario(String usuario, String senha) throws Exception{
		LOG.info("Inicio business Usuario");
		UsuarioResponse retorno = new UsuarioResponse();
		Usuario usuarioRet = usuarioRepository.findByUsuarioAndSenha(usuario, senha);
		
		if (usuarioRet == null) {
			throw new Exception("usuario nao encontrado");
		}
		
		retorno.setDataCadastro(usuarioRet.getDataCadastro());
		retorno.setIdUsuario(usuarioRet.getIdUsuario());
		retorno.setIndSuperUsuario(usuarioRet.getIndSuperUsuario());
		retorno.setSenha(usuarioRet.getSenha());
		retorno.setUsuario(usuarioRet.getUsuario());
		
		LOG.info("Final business Usuario - "+retorno);
		
		return retorno;
		
	}
}
