package br.edu.infnet.appAluguelVestuario.model.domain;

public class Calcado extends Vestuario {
	private int tamanho;
	private String tipoDeSalto;
	private String cor;
	
	@Override
	public String toString() {
		return tamanho + ";" + tipoDeSalto + ";" + cor  + ";" + getNome() + ";" + getValorDoAluguel() + ";" + isReservado();
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
}
