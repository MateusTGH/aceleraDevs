package com.stefanini.aceleraDevs.exception;

public class TurmaNotFoundException extends Exception{
    private static final long serialVersionUID = 1L;

	public TurmaNotFoundException(Long id) {
       super("Turma não encontrado com id:" +id);
    }
}
