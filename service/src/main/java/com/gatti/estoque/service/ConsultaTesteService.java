package com.gatti.estoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gatti.estoque.business.ConsultaTesteBusiness;
import com.gatti.estoque.domain.response.TesteResponse;

@Service
public class ConsultaTesteService {
	
	@Autowired
	private ConsultaTesteBusiness consultaTeste;
	
	public List<TesteResponse> consultaTeste(){
		return consultaTeste.consultaTeste();
	}
	
}
