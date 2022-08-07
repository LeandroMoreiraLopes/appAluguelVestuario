package br.edu.infnet.appAluguelVestuario.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAluguelVestuario.model.domain.Calcado;

@Component
public class CalcadoTeste implements ApplicationRunner{
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Calçados");
		
		Calcado c1 = new Calcado();
		c1.tamanho = 38;
		c1.tipoDeSalto = "Baixo";
		c1.cor = "Preto";
		System.out.println(c1);
		
		Calcado a2 = new Calcado();
		a2.tamanho = 41;
		a2.tipoDeSalto = "Baixo";
		a2.cor = "Preto";
		System.out.println(a2);
		
		Calcado a3 = new Calcado();
		a3.tamanho = 34;
		a3.tipoDeSalto = "15cm";
		a3.cor = "Prata";
		System.out.println(a3);		
	}
}
