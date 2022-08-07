package br.edu.infnet.appAluguelVestuario.model.test;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAluguelVestuario.model.domain.Aluguel;

@Component
public class AluguelTeste implements ApplicationRunner{
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Alugueis");
		
		Aluguel a1 = new Aluguel();
		a1.itemAlugado = "Paletó Spring";
		a1.valorTotal = 1600.00;
		a1.dataEvento = LocalDateTime.of(2022, 11, 12, 19, 0);
		System.out.println(a1);
		
		Aluguel a2 = new Aluguel();
		a2.itemAlugado = "Paletó Black";
		a2.valorTotal = 650.00;
		a2.dataEvento = LocalDateTime.of(2022, 11, 12, 19, 0);
		System.out.println(a2);
		
		Aluguel a3 = new Aluguel();
		a3.itemAlugado = "Vestido Floral";
		a3.valorTotal = 500.00;
		a3.dataEvento = LocalDateTime.of(2022, 11, 12, 19, 0);
		System.out.println(a3);		
	}
}
