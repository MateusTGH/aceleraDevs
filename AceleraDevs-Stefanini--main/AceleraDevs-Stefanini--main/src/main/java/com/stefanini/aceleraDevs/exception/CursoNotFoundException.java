package com.stefanini.aceleraDevs.exception;

public class CursoNotFoundException extends Exception{
    private static final long serialVersionUID = 1L;

	public CursoNotFoundException(Long id) {
       super("Curso não encontrado com id:" +id);
    }
}
