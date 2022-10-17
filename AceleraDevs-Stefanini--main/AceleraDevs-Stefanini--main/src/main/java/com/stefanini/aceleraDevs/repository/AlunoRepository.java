package com.stefanini.aceleraDevs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stefanini.aceleraDevs.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

	void modifica(Aluno aluno);
}
