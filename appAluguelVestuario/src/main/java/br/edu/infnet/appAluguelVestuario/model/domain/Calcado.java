package br.edu.infnet.appAluguelVestuario.model.domain;

public class Calcado {
	public int tamanho;
	public String tipoDeSalto;
	public String cor;
	
	@Override
	public String toString() {
		return tamanho + ";" + tipoDeSalto + ";" + cor;
	}

}
