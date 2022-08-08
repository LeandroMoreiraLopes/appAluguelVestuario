package br.edu.infnet.appAluguelVestuario.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAluguelVestuario.model.domain.Acessorio;

@Component
@Order(5)
public class AcessorioTeste implements ApplicationRunner{
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Acessórios");
		
		Acessorio a1 = new Acessorio();
		a1.setNome("Gucci N");
		a1.setValorDoAluguel(30.0);
		a1.setReservado(true);
		a1.setDescricao("VX 1300");
		a1.setTipo("Colar");
		a1.setMaterial("Prata com brilhantes");
		System.out.println(a1);
		
		Acessorio a2 = new Acessorio();
		a2.setNome("Ear GG");
		a2.setValorDoAluguel(20.0);
		a2.setReservado(true);
		a2.setDescricao("AB longo");
		a2.setTipo("Brincos");
		a2.setMaterial("Prata");
		System.out.println(a2);
		
		Acessorio a3 = new Acessorio();
		a3.setNome("WST");
		a3.setValorDoAluguel(20.0);
		a3.setReservado(true);
		a3.setDescricao("PL 123");
		a3.setTipo("Pulseira");
		a3.setMaterial("Prata com brilhantes");
		System.out.println(a3);		
	}
}
