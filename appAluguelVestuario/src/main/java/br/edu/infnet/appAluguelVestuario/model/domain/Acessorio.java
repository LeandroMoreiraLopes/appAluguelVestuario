package br.edu.infnet.appAluguelVestuario.model.domain;

public class Acessorio extends Vestuario{
	private String descricao;
	private String tipo;
	private String material;
	
	@Override
	public String toString() {
		return descricao + ";" + tipo + ";" + material + ";" + getNome() + ";" + getValorDoAluguel() + ";" + isReservado();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
