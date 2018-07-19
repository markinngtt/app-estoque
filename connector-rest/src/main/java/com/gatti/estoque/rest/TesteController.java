package com.gatti.estoque.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gatti.estoque.domain.response.TesteResponse;
import com.gatti.estoque.service.ConsultaTesteService;

@RestController
@RequestMapping("/v1/teste")
public class TesteController {
	
	@Autowired
	private ConsultaTesteService testeService;
	
	@RequestMapping(path="/consuta-todos")
	public ResponseEntity<List<TesteResponse>> consultaTodos(){
		return ResponseEntity.ok(testeService.consultaTeste());
	}

}
