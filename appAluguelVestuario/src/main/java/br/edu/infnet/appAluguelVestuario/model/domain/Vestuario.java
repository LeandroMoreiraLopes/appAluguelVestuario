package br.edu.infnet.appAluguelVestuario.model.domain;

public class Vestuario {
	private String nome;
	private double valorDoAluguel;
	private boolean reservado;
	
	@Override
	public String toString() {
		return nome + ";" + valorDoAluguel + ";" + reservado;				
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorDoAluguel() {
		return valorDoAluguel;
	}

	public void setValorDoAluguel(double valorDoAluguel) {
		this.valorDoAluguel = valorDoAluguel;
	}

	public boolean isReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
	
	
}
