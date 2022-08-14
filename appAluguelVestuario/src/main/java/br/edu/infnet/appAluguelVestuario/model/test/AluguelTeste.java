package br.edu.infnet.appAluguelVestuario.model.test;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAluguelVestuario.model.domain.Aluguel;

@Component
@Order(1)
public class AluguelTeste implements ApplicationRunner{
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Alugueis");
		
		Aluguel a1 = new Aluguel();
		a1.setItemAlugado("Paletó Spring");
		a1.setValorTotal(1600.00);
		a1.setDataEvento(LocalDateTime.of(2022, 11, 12, 19, 0));
		System.out.println(a1);
		
		AppImpressao.relatorio("Inclusão do aluguel 1", a1);
		
		Aluguel a2 = new Aluguel();
		a2.setItemAlugado("Paletó Black");
		a2.setValorTotal(650.00);
		a2.setDataEvento(LocalDateTime.of(2022, 11, 12, 19, 0));
		System.out.println(a2);
		
		AppImpressao.relatorio("Inclusão do aluguel 2", a2);
		
		Aluguel a3 = new Aluguel();
		a3.setItemAlugado("Vestido Floral");
		a3.setValorTotal(500.00);
		a3.setDataEvento(LocalDateTime.of(2022, 11, 12, 19, 0));
		System.out.println(a3);	
		
		AppImpressao.relatorio("Inclusão do aluguel 3", a3);
	}
}
