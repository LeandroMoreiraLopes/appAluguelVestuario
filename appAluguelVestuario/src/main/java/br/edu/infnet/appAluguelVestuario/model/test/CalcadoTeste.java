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
		c1.setReservado(true);
		c1.setTamanho(38);
		c1.setTipoDeSalto("Baixo");
		c1.setCor("Preto");
		System.out.println(c1);
		
		Calcado c2 = new Calcado();
		c2.setNome("Mocassino");
		c2.setValorDoAluguel(100.0);
		c2.setReservado(true);
		c2.setTamanho(41);
		c2.setTipoDeSalto("Baixo");
		c2.setCor("Preto");
		System.out.println(c2);
		
		Calcado c3 = new Calcado();
		c3.setNome("Mocassino");
		c3.setValorDoAluguel(100.0);
		c3.setReservado(true);
		c3.setTamanho(34);
		c3.setTipoDeSalto("15cm");
		c3.setCor("Prata");
		System.out.println(c3);		
	}
}
