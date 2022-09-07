package br.edu.infnet.appAluguelVestuario.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAluguelVestuario.model.domain.Calcado;
import br.edu.infnet.appAluguelVestuario.model.exceptions.TamanhoInvalidoException;
import br.edu.infnet.appAluguelVestuario.model.service.CalcadoService;

@Component
@Order(4)
public class CalcadoTeste implements ApplicationRunner {
	
	@Autowired
	private CalcadoService calcadoService;
	
	public void run(ApplicationArguments args) {
		System.out.println("#Inserindo Calçados");

		try {
			Calcado c1 = new Calcado();
			c1.setNome("Mocassino");
			c1.setValorDoAluguel(100.0);
			c1.setQtdDias(1);
			c1.setTamanho(38);
			c1.setTipoDeSalto("Baixo");
			c1.setCor("Preto");
			System.out.println("Cálculo de aluguel: " + c1.calcularAluguel());
			calcadoService.incluir(c1);
		} catch (TamanhoInvalidoException e) {
			System.out.println("[ERROR - CALCADO] " + e.getMessage());
		}

		try {
			Calcado c2 = new Calcado();
			c2.setNome("Bico quadrado");
			c2.setValorDoAluguel(90.0);
			c2.setQtdDias(2);
			c2.setTamanho(41);
			c2.setTipoDeSalto("Baixo");
			c2.setCor("Preto");
			System.out.println("Cálculo de aluguel: " + c2.calcularAluguel());
			calcadoService.incluir(c2);
		} catch (TamanhoInvalidoException e) {
			System.out.println("[ERROR - CALCADO] " + e.getMessage());
		}
		
		try {
			Calcado c3 = new Calcado();
			c3.setNome("Scarpin");
			c3.setValorDoAluguel(120.0);
			c3.setQtdDias(3);
			c3.setTamanho(34);
			c3.setTipoDeSalto("15cm");
			c3.setCor("Prata");
			System.out.println("Cálculo de aluguel: " + c3.calcularAluguel());
			calcadoService.incluir(c3);
		} catch (TamanhoInvalidoException e) {
			System.out.println("[ERROR - CALCADO] " + e.getMessage());
		}
		
		try {
			Calcado c4 = new Calcado();
			c4.setNome("Havaiana");
			c4.setValorDoAluguel(120.0);
			c4.setQtdDias(3);
			c4.setTamanho(20);
			c4.setTipoDeSalto("15cm");
			c4.setCor("Prata");
			System.out.println("Cálculo de aluguel: " + c4.calcularAluguel());
			calcadoService.incluir(c4);
		} catch (TamanhoInvalidoException e) {
			System.out.println("[ERROR - CALCADO] " + e.getMessage());
		}
	}
}
