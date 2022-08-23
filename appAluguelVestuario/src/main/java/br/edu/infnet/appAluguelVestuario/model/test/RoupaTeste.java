package br.edu.infnet.appAluguelVestuario.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAluguelVestuario.model.controller.RoupaController;
import br.edu.infnet.appAluguelVestuario.model.domain.Roupa;
import br.edu.infnet.appAluguelVestuario.model.exceptions.QtdDiasInvalidoException;

@Component
@Order(3)
public class RoupaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {
		System.out.println("#Inserindo Roupas");

		try {
			Roupa r1 = new Roupa();
			r1.setNome("Paletó Summer");
			r1.setValorDoAluguel(1600);
			r1.setQtdDias(2);
			r1.setTamanho("G");
			r1.setTipoDeTecido("Poliéster");
			r1.setParaNoite(false);
			System.out.println("Cálculo de aluguel: " + r1.calcularAluguel());
			RoupaController.incluir(r1);
		} catch (QtdDiasInvalidoException e) {
			System.out.println("[ERROR - ROUPA] " + e.getMessage());
		}

		try {
			Roupa r2 = new Roupa();
			r2.setNome("Paletó Grafite");
			r2.setValorDoAluguel(650);
			r2.setQtdDias(3);
			r2.setTamanho("M");
			r2.setTipoDeTecido("Brim");
			r2.setParaNoite(false);
			System.out.println("Cálculo de aluguel: " + r2.calcularAluguel());
			RoupaController.incluir(r2);
		} catch (QtdDiasInvalidoException e) {
			System.out.println("[ERROR - ROUPA] " + e.getMessage());
		}

		try {
			Roupa r3 = new Roupa();
			r3.setNome("Vestido Floral");
			r3.setValorDoAluguel(500);
			r3.setQtdDias(1);
			r3.setTamanho("P");
			r3.setTipoDeTecido("Veludo");
			r3.setParaNoite(true);
			System.out.println("Cálculo de aluguel: " + r3.calcularAluguel());
			RoupaController.incluir(r3);
		} catch (QtdDiasInvalidoException e) {
			System.out.println("[ERROR - ROUPA] " + e.getMessage());
		}
		
		try {
			Roupa r4 = new Roupa();
			r4.setNome("Vestido com defeito");
			r4.setValorDoAluguel(500);
			r4.setQtdDias(0);
			r4.setTamanho("P");
			r4.setTipoDeTecido("Veludo");
			r4.setParaNoite(true);
			System.out.println("Cálculo de aluguel: " + r4.calcularAluguel());
			RoupaController.incluir(r4);
		} catch (QtdDiasInvalidoException e) {
			System.out.println("[ERROR - ROUPA] " + e.getMessage());
		}
	}
}
