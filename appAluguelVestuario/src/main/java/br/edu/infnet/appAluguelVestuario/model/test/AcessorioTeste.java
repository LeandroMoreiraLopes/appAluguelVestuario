package br.edu.infnet.appAluguelVestuario.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAluguelVestuario.model.domain.Acessorio;

@Component
public class AcessorioTeste implements ApplicationRunner{
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Acessórios");
		
		Acessorio a1 = new Acessorio();
		a1.descricao = "VX 1300";
		a1.tipo = "Colar";
		a1.material = "Prata com brilhantes";
		System.out.println(a1);
		
		Acessorio a2 = new Acessorio();
		a2.descricao = "AB longo";
		a2.tipo = "Brincos";
		a2.material = "Prata";
		System.out.println(a2);
		
		Acessorio a3 = new Acessorio();
		a3.descricao = "PL 123";
		a3.tipo = "Pulseira";
		a3.material = "Prata com brilhantes";
		System.out.println(a3);		
	}
}
