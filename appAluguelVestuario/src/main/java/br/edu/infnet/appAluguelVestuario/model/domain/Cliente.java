package br.edu.infnet.appAluguelVestuario.model.domain;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

import br.edu.infnet.appAluguelVestuario.interfaces.IPrinter;
import br.edu.infnet.appAluguelVestuario.model.exceptions.CpfInvalidoException;

@Entity
@Table(name = "TCliente")
public class Cliente implements IPrinter{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String cpf;
	private LocalDateTime dataNascimento;

	public Cliente() {
		
	}
	
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
	
	public void setDataNascimento(String data) {
		String[] dataNasc = data.split("-");
		dataNascimento = LocalDateTime.of(Integer.parseInt(dataNasc[2]),
											Integer.parseInt(dataNasc[1]),
											Integer.parseInt(dataNasc[0]),
											0, 0);
	}
}
