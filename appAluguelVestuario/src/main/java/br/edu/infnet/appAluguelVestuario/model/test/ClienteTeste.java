package br.edu.infnet.appAluguelVestuario.model.test;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAluguelVestuario.model.domain.Cliente;

@Component
public class ClienteTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Clientes");
		
		Cliente c1 = new Cliente();
		c1.nome = "Leandro";
		c1.cpf = "11111111111";
		c1.dataNascimento = LocalDateTime.of(1981, 9, 9, 0, 0);
		System.out.println(c1);
		
		Cliente c2 = new Cliente();
		c2.nome = "Gabriel";
		c2.cpf = "22222222222";
		c2.dataNascimento = LocalDateTime.of(2007, 10, 01, 0, 0);
		System.out.println(c2);
		
		Cliente c3 = new Cliente();
		c3.nome = "Enilda";
		c3.cpf = "33333333333";
		c3.dataNascimento = LocalDateTime.of(1948, 10, 11, 0, 0);
		System.out.println(c3);		
		
	}
	
}
