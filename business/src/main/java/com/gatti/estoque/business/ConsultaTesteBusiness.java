package com.gatti.estoque.business;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gatti.estoque.domain.entity.Teste;
import com.gatti.estoque.domain.response.TesteResponse;
import com.gatti.estoque.persist.repository.TesteRepository;

@Component
public class ConsultaTesteBusiness {
	
	private static final Logger LOG = Logger.getLogger(ConsultaTesteBusiness.class);
	
	@Autowired
	private TesteRepository teste;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public List<TesteResponse> consultaTeste(){
		LOG.info("Inicio business Teste");
		List<TesteResponse> listReturn = new ArrayList<>();
		List<Teste> listTeste = teste.findAll();
		if (!listTeste.isEmpty()){
			for (Teste teste : listTeste){
				listReturn.add(new TesteResponse(teste.getId(), 
						                         teste.getNome()));
			}
		}
		
		return listReturn;
		
	}

}
