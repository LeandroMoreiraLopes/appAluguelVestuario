package br.edu.infnet.appAluguelVestuario.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAluguelVestuario.model.domain.Acessorio;
import br.edu.infnet.appAluguelVestuario.model.exceptions.DescricaoInvalidaException;
import br.edu.infnet.appAluguelVestuario.model.service.AcessorioService;

@Component
@Order(5)
public class AcessorioTeste implements ApplicationRunner{
	
	@Autowired
	private AcessorioService acessorioService;
	
	public void run(ApplicationArguments args) {
		System.out.println("#Inserindo Acessórios");
				
		try {
			Acessorio a1 = new Acessorio();
			a1.setNome("Gucci N");
			a1.setValorDoAluguel(30.0);
			a1.setQtdDias(3);
			a1.setDescricao("VX 1300");
			a1.setTipo("Colar");
			a1.setMaterial("Prata com brilhantes");
			System.out.println("Cálculo do aluguel: " + a1.calcularAluguel());
			acessorioService.incluir(a1);
		} catch (DescricaoInvalidaException e) {
			System.out.println("[ERRO - ACESSORIO] " + e.getMessage());
		}
				
		try {
			Acessorio a2 = new Acessorio();
			a2.setNome("Ear GG");
			a2.setValorDoAluguel(20.0);
			a2.setQtdDias(2);
			a2.setDescricao("AB longo");
			a2.setTipo("Brincos");
			a2.setMaterial("Prata");
			System.out.println("Cálculo do aluguel: " + a2.calcularAluguel());
			acessorioService.incluir(a2);
		} catch (DescricaoInvalidaException e) {
			System.out.println("[ERRO - ACESSORIO] " + e.getMessage());
		}
				
		try {
			Acessorio a3 = new Acessorio();
			a3.setNome("WST");
			a3.setValorDoAluguel(20.0);
			a3.setQtdDias(1);
			a3.setDescricao("PL 123");
			a3.setTipo("Pulseira");
			a3.setMaterial("Prata com brilhantes");
			System.out.println("Cálculo do aluguel: " + a3.calcularAluguel());
			acessorioService.incluir(a3);
		} catch (DescricaoInvalidaException e) {
			System.out.println("[ERRO - ACESSORIO] " + e.getMessage());
		}	
		
		try {
			Acessorio a4 = new Acessorio();
			a4.setNome("WTF");
			a4.setValorDoAluguel(20.0);
			a4.setQtdDias(1);
			a4.setDescricao("");
			a4.setTipo("Gargantilha");
			a4.setMaterial("Couro Trançado");
			System.out.println("Cálculo do aluguel: " + a4.calcularAluguel());
			acessorioService.incluir(a4);
		} catch (DescricaoInvalidaException e) {
			System.out.println("[ERRO - ACESSORIO] " + e.getMessage());
		}
		
		try {
			Acessorio a5 = new Acessorio();
			a5.setNome("WTF2");
			a5.setValorDoAluguel(20.0);
			a5.setQtdDias(1);
			a5.setDescricao(null);
			a5.setTipo("Tornoseleira");
			a5.setMaterial("Couro");
			System.out.println("Cálculo do aluguel: " + a5.calcularAluguel());
			acessorioService.incluir(a5);
		} catch (DescricaoInvalidaException e) {
			System.out.println("[ERRO - ACESSORIO] " + e.getMessage());
		}
	}
}
