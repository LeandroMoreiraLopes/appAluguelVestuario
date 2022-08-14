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
		System.out.println("#Inserindo Acessórios");
		
		Acessorio a1 = new Acessorio();
		a1.setNome("Gucci N");
		a1.setValorDoAluguel(30.0);
		a1.setQtdDias(3);
		a1.setDescricao("VX 1300");
		a1.setTipo("Colar");
		a1.setMaterial("Prata com brilhantes");
		
		AppImpressao.relatorio("Inclusão do acessorio Gucci N", a1);
		
		Acessorio a2 = new Acessorio();
		a2.setNome("Ear GG");
		a2.setValorDoAluguel(20.0);
		a2.setQtdDias(2);
		a2.setDescricao("AB longo");
		a2.setTipo("Brincos");
		a2.setMaterial("Prata");
		
		AppImpressao.relatorio("Inclusão do acessorio Ear GG", a2);
		
		Acessorio a3 = new Acessorio();
		a3.setNome("WST");
		a3.setValorDoAluguel(20.0);
		a3.setQtdDias(1);
		a3.setDescricao("PL 123");
		a3.setTipo("Pulseira");
		a3.setMaterial("Prata com brilhantes");
		
		AppImpressao.relatorio("Inclusão do acessorio WST", a3);
	}
}
