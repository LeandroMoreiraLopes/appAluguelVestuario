package br.edu.infnet.appAluguelVestuario.model.domain;

import java.time.LocalDateTime;

public class Cliente {
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
	public String toString() {
		return nome + ";" + cpf + ";" + dataNascimento;
	}

}
