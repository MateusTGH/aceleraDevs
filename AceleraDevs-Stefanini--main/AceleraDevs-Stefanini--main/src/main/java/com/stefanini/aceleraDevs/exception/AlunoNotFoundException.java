package com.stefanini.aceleraDevs.exception;

@SuppressWarnings("serial")
public class AlunoNotFoundException extends Exception{
    public AlunoNotFoundException(Long id) {
       super("Aluno não encontrado com id:" +id);
    }
}
