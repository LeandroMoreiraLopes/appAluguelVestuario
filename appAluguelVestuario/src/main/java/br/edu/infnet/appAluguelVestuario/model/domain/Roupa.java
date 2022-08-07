package br.edu.infnet.appAluguelVestuario.model.domain;

public class Roupa {
	public String tamanho;
	public String tipoDeTecido;
	public boolean paraNoite;
	
	@Override
	public String toString() {
		return tamanho + ";" + tipoDeTecido + ";" + paraNoite;
	}
}
