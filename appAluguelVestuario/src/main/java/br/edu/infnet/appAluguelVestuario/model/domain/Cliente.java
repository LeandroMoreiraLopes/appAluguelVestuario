package br.edu.infnet.appAluguelVestuario.model.domain;

import java.time.LocalDateTime;

public class Cliente {
	public String nome;
	public String cpf;
	public LocalDateTime dataNascimento;
	
	@Override
	public String toString() {
		return nome + ";" + cpf + ";" + dataNascimento;
	}

}
