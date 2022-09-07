package br.edu.infnet.appAluguelVestuario.model.domain;

import java.time.LocalDateTime;
import java.util.Set;

import br.edu.infnet.appAluguelVestuario.interfaces.IPrinter;
import br.edu.infnet.appAluguelVestuario.model.exceptions.AluguelSemVestuarioException;
import br.edu.infnet.appAluguelVestuario.model.exceptions.ClienteNuloException;

public class Aluguel implements IPrinter{
	private Integer id;
	private String itemAlugado;
	private double valorTotal;
	private LocalDateTime dataEvento;
	private Cliente cliente;
	private Set<Vestuario> listaVestuario;

	public Aluguel(Cliente cliente, Set<Vestuario> listaVestuario) throws ClienteNuloException, AluguelSemVestuarioException{

		if (cliente == null) {
			throw new ClienteNuloException("Impossível criar um aluguel sem cliente");
		}

		if (listaVestuario == null) {
			throw new AluguelSemVestuarioException("Impossível criar um aluguel com vestuário nulo");
		}

		else if (listaVestuario.size() <= 0) {
			throw new AluguelSemVestuarioException("Impossível criar um aluguel sem vestuários");
		}

		this.cliente  = cliente;
		this.listaVestuario = listaVestuario;
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

	public Cliente getCliente() {
		return cliente;
	}

//	public void setListaVestuario(Set<Vestuario> listaVestuario) {
//		this.listaVestuario = listaVestuario;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
