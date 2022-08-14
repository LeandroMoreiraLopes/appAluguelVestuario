package br.edu.infnet.appAluguelVestuario.model.domain;

public abstract class Vestuario {
	private String nome;
	private double valorDoAluguel;
	private int qtdDias;
	
	public double calcularAluguel()
	{
		return valorDoAluguel * qtdDias;
	}
	
	public abstract void impressao();
	
	@Override
	public String toString() {
		return nome + ";" + valorDoAluguel + ";" + qtdDias + ";" + calcularAluguel();				
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

	public int getQtdDias() {
		return qtdDias;
	}

	public void setQtdDias(int qtdDias) {
		this.qtdDias = qtdDias;
	}
	
	
}
