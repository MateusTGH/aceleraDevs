package com.stefanini.aceleraDevs.exception;

public class DadosPessoaisNotFoundException extends Exception{
    private static final long serialVersionUID = 1L;

	public DadosPessoaisNotFoundException(Long id) {
       super("Dados Pessoais não encontrado com id:" +id);
    }
}
