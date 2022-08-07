package br.edu.infnet.appAluguelVestuario.model.domain;

import java.time.LocalDateTime;

public class Aluguel {
	public String itemAlugado;
	public double valorTotal;
	public LocalDateTime dataEvento;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return itemAlugado + ";" + valorTotal + ";" + dataEvento; 
	}
	

}
