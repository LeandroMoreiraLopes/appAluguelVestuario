package br.edu.infnet.appAluguelVestuario.model.exceptions;

public class DescricaoInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;

	public DescricaoInvalidaException(String mensagem){
		super(mensagem);
	}
}
