package br.edu.infnet.appAluguelVestuario.model.domain;

import java.time.LocalDateTime;

import br.edu.infnet.appAluguelVestuario.model.interfaces.IPrinter;

public class Cliente implements IPrinter{
	private String nome;
	private String cpf;
	private LocalDateTime dataNascimento;
	
	public Cliente(String nome, String cpf, LocalDateTime dataNascimento)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public void impressao() {
		System.out.println("#Cliente");
		System.out.println(this);	
	}
	
	
	@Override
	public String toString() {
		return nome + ";" + cpf + ";" + dataNascimento;
	}

}
