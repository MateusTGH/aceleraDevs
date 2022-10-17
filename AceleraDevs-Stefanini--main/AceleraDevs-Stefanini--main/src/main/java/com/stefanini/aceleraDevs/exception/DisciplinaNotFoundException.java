package com.stefanini.aceleraDevs.exception;

public class DisciplinaNotFoundException extends Exception{
    private static final long serialVersionUID = 1L;

	public DisciplinaNotFoundException(Long id) {
       super("Disciplina não encontrado com id:" +id);
    }
}
