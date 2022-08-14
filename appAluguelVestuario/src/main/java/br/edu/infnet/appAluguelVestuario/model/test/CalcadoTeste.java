package br.edu.infnet.appAluguelVestuario.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAluguelVestuario.model.domain.Calcado;

@Component
@Order(4)
public class CalcadoTeste implements ApplicationRunner{
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Calçados");
		
		Calcado c1 = new Calcado();
		c1.setNome("Mocassino");
		c1.setValorDoAluguel(100.0);
		c1.setQtdDias(1);
		c1.setTamanho(38);
		c1.setTipoDeSalto("Baixo");
		c1.setCor("Preto");
		System.out.println(c1);
		
		AppImpressao.relatorio("Inclusão do calcado mocassino", c1);
		
		Calcado c2 = new Calcado();
		c2.setNome("Bico quadrado");
		c2.setValorDoAluguel(90.0);
		c2.setQtdDias(2);
		c2.setTamanho(41);
		c2.setTipoDeSalto("Baixo");
		c2.setCor("Preto");
		System.out.println(c2);
		
		AppImpressao.relatorio("Inclusão do calcado bico quadrado", c2);
		
		Calcado c3 = new Calcado();
		c3.setNome("Scarpin");
		c3.setValorDoAluguel(120.0);
		c3.setQtdDias(3);
		c3.setTamanho(34);
		c3.setTipoDeSalto("15cm");
		c3.setCor("Prata");
		System.out.println(c3);		
		
		AppImpressao.relatorio("Inclusão do calcado scarpin", c3);
	}
}
