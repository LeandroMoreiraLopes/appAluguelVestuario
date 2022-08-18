package br.edu.infnet.appAluguelVestuario.model.test;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAluguelVestuario.model.controller.AluguelController;
import br.edu.infnet.appAluguelVestuario.model.domain.Acessorio;
import br.edu.infnet.appAluguelVestuario.model.domain.Aluguel;
import br.edu.infnet.appAluguelVestuario.model.domain.Calcado;
import br.edu.infnet.appAluguelVestuario.model.domain.Cliente;
import br.edu.infnet.appAluguelVestuario.model.domain.Roupa;
import br.edu.infnet.appAluguelVestuario.model.domain.Vestuario;

@Component
@Order(1)
public class AluguelTeste implements ApplicationRunner{
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Inserindo Alugueis");
		
		Roupa r1 = new Roupa();
		r1.setNome("Paletó Summer");
		r1.setValorDoAluguel(1600);
		r1.setQtdDias(2);
		r1.setTamanho("G");
		r1.setTipoDeTecido("Poliéster");
		r1.setParaNoite(false);
		Calcado ca1 = new Calcado();
		ca1.setNome("Mocassino");
		ca1.setValorDoAluguel(100.0);
		ca1.setQtdDias(1);
		ca1.setTamanho(38);
		ca1.setTipoDeSalto("Baixo");
		ca1.setCor("Preto");
		Acessorio ac1 = new Acessorio();
		ac1.setNome("Gucci N");
		ac1.setValorDoAluguel(30.0);
		ac1.setQtdDias(3);
		ac1.setDescricao("VX 1300");
		ac1.setTipo("Colar");
		ac1.setMaterial("Prata com brilhantes");
		Acessorio ac2 = new Acessorio();
		ac2.setNome("Gucci N");
		ac2.setValorDoAluguel(30.0);
		ac2.setQtdDias(3);
		ac2.setDescricao("VX 1300");
		ac2.setTipo("Colar");
		ac2.setMaterial("Prata com brilhantes");
		
		//--------------------------
		
		Set<Vestuario> listaVestiario1 = new HashSet<Vestuario>();		
		listaVestiario1.add(r1);
		listaVestiario1.add(ca1);
		listaVestiario1.add(ac1);
		listaVestiario1.add(ac1);
		listaVestiario1.add(ac2);
		
		Cliente c1 = new Cliente("Leandro", "11111111111", LocalDateTime.of(1981, 9, 9, 0, 0));
				
		Aluguel a1 = new Aluguel(c1);
		a1.setItemAlugado("Paletó Spring");
		a1.setValorTotal(1600.00);
		a1.setDataEvento(LocalDateTime.of(2022, 11, 12, 19, 0));
		a1.setListaVestuario(listaVestiario1);
		AluguelController.incluir(a1);
		
		//--------------------------
		
		Set<Vestuario> listaVestiario2 = new HashSet<Vestuario>();		
		listaVestiario2.add(r1);
		listaVestiario2.add(ac1);
		
		Cliente c2 = new Cliente("Gabriel", "22222222222", LocalDateTime.of(2007, 10, 01, 0, 0));
		
		Aluguel a2 = new Aluguel(c2);
		a2.setItemAlugado("Paletó Black");
		a2.setValorTotal(650.00);
		a2.setDataEvento(LocalDateTime.of(2022, 11, 12, 19, 0));
		a2.setListaVestuario(listaVestiario2);
		AluguelController.incluir(a2);
		
		//--------------------------
				
		Set<Vestuario> listaVestiario3 = new HashSet<Vestuario>();		
		listaVestiario3.add(r1);
		
		Cliente c3 = new Cliente("Enilda", "33333333333", LocalDateTime.of(1948, 10, 11, 0, 0));
		
		Aluguel a3 = new Aluguel(c3);
		a3.setItemAlugado("Vestido Floral");
		a3.setValorTotal(500.00);
		a3.setDataEvento(LocalDateTime.of(2022, 11, 12, 19, 0));
		a3.setListaVestuario(listaVestiario3);
		AluguelController.incluir(a3);
	}
}
