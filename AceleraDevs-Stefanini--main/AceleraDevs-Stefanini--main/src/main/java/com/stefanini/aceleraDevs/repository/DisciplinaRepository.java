package com.stefanini.aceleraDevs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stefanini.aceleraDevs.model.Disciplina;

public interface DisciplinaRepository extends JpaRepository <Disciplina, Long> {

	void edite(Disciplina disciplina);
}
