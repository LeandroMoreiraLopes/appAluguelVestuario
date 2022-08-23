package br.edu.infnet.appAluguelVestuario.model.domain;

import java.time.LocalDateTime;

import br.edu.infnet.appAluguelVestuario.model.exceptions.CpfInvalidoException;
import br.edu.infnet.appAluguelVestuario.model.interfaces.IPrinter;

public class Cliente implements IPrinter{
	private int id;
	private String nome;
	private String cpf;
	private LocalDateTime dataNascimento;
	
	public Cliente(String nome, String cpf, LocalDateTime dataNascimento) throws CpfInvalidoException
	{
		if (cpf == null) {
			throw new CpfInvalidoException("Não é possível aceitar CPF nulo.");
		}
		
		else if (cpf.isEmpty()) {
			throw new CpfInvalidoException("Não é possível aceitar CPF sem preenchimento.");
		}
			
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}
}
