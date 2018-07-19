package com.gatti.estoque.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gatti.estoque.domain.response.UsuarioResponse;
import com.gatti.estoque.service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
	@RequestMapping(path="/consulta-usuario/{usuario}/{senha}")
	@ResponseBody
	public ResponseEntity<UsuarioResponse> login(@PathVariable String usuario, @PathVariable String senha) throws Exception {
		
		return ResponseEntity.ok(usuarioService.consultaUsuario(usuario, senha));
		
    }
	
}
