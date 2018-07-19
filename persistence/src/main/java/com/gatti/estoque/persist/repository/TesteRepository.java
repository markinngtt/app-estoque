package com.gatti.estoque.persist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gatti.estoque.domain.entity.Teste;

@Repository
public interface TesteRepository extends JpaRepository<Teste, Long>{

}
