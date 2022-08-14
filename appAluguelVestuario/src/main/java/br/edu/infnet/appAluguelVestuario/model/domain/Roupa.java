package br.edu.infnet.appAluguelVestuario.model.domain;

public class Roupa extends Vestuario{
	private String tamanho;
	private String tipoDeTecido;
	private boolean paraNoite;
	
	@Override
	public double calcularAluguel() {
		double multiplicador = paraNoite ? 1.3d : 1d; 
		return super.calcularAluguel() * multiplicador;
	}
	
	@Override
	public String toString() {
		return tamanho + ";" + tipoDeTecido + ";" + paraNoite + ";" + super.toString();
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getTipoDeTecido() {
		return tipoDeTecido;
	}

	public void setTipoDeTecido(String tipoDeTecido) {
		this.tipoDeTecido = tipoDeTecido;
	}

	public boolean isParaNoite() {
		return paraNoite;
	}

	public void setParaNoite(boolean paraNoite) {
		this.paraNoite = paraNoite;
	}

	@Override
	public void impressao() {
		System.out.println("#Roupa");
		System.out.println(this);		
	}
}
