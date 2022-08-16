package br.edu.infnet.appAluguelVestuario.model.domain;

import java.time.LocalDateTime;
import java.util.Set;

import br.edu.infnet.appAluguelVestuario.model.interfaces.IPrinter;

public class Aluguel implements IPrinter{
	private String itemAlugado;
	private double valorTotal;
	private LocalDateTime dataEvento;
	private Cliente cliente;
	private Set<Vestuario> listaVestuario;
	
	public Aluguel(Cliente cliente){
		this.cliente  = cliente;
	}

	@Override
	public void impressao() {
		System.out.println("#Aluguel");
		System.out.println(this);	
	}
	
	@Override
	public String toString() {
		return itemAlugado + ";" + valorTotal + ";" + dataEvento + ";" + cliente + ";" + listaVestuario.size(); 
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
	
	public Set<Vestuario> getListaVestuario() {
		return listaVestuario;
	}

	public void setListaVestuario(Set<Vestuario> listaVestuario) {
		this.listaVestuario = listaVestuario;
	}
}
