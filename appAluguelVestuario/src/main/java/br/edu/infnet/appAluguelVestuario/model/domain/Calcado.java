package br.edu.infnet.appAluguelVestuario.model.domain;

public class Calcado extends Vestuario {
	private int tamanho;
	private String tipoDeSalto;
	private String cor;
	
	@Override
	public double calcularAluguel() {
		double multiplicador = tamanho < 35 ? 0.8d : 1d;
		
		return getValorDoAluguel() * multiplicador;
	}
	
	@Override
	public String toString() {
		return tamanho + ";" + tipoDeSalto + ";" + cor  + ";" + super.toString();
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getTipoDeSalto() {
		return tipoDeSalto;
	}

	public void setTipoDeSalto(String tipoDeSalto) {
		this.tipoDeSalto = tipoDeSalto;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public void impressao() {
		System.out.println("#Calcado");
		System.out.println(this);			
	}
}
