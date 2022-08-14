package br.edu.infnet.appAluguelVestuario.model.test;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAluguelVestuario.model.domain.Cliente;

@Component
@Order(2)
public class ClienteTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Clientes");
		
		Cliente c1 = new Cliente("Leandro", "11111111111", LocalDateTime.of(1981, 9, 9, 0, 0));
		System.out.println(c1);
		
		AppImpressao.relatorio("Inclusão do cliente 1", c1);
		
		Cliente c2 = new Cliente("Gabriel", "22222222222", LocalDateTime.of(2007, 10, 01, 0, 0));
		System.out.println(c2);
		
		AppImpressao.relatorio("Inclusão do cliente 2", c2);
		
		Cliente c3 = new Cliente("Enilda", "33333333333", LocalDateTime.of(1948, 10, 11, 0, 0));
		System.out.println(c3);
		
		AppImpressao.relatorio("Inclusão do cliente 3", c3);
	}	
}
