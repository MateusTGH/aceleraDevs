package com.stefanini.aceleraDevs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stefanini.aceleraDevs.model.DadosPessoais;

public interface DadosPessoaisRepository extends JpaRepository <DadosPessoais, Long> {

	void edite(DadosPessoais dadosPessoais);
}
