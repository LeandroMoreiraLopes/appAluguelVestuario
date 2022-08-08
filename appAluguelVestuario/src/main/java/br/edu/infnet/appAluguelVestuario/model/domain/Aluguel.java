package br.edu.infnet.appAluguelVestuario.model.domain;

import java.time.LocalDateTime;

public class Aluguel {
	private String itemAlugado;
	private double valorTotal;
	private LocalDateTime dataEvento;
	
	@Override
	public String toString() {
		return itemAlugado + ";" + valorTotal + ";" + dataEvento; 
	}

	public String getItemAlugado() {
		return itemAlugado;
	}

	public void setItemAlugado(String itemAlugado) {
		this.itemAlugado = itemAlugado;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public LocalDateTime getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(LocalDateTime dataEvento) {
		this.dataEvento = dataEvento;
	}
	
	
}
