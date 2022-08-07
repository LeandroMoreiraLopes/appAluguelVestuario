package br.edu.infnet.appAluguelVestuario.model.domain;

public class Acessorio {
	public String descricao;
	public String tipo;
	public String material;
	
	@Override
	public String toString() {
		return descricao + ";" + tipo + ";" + material;
	}

}
