package br.edu.infnet.appAluguelVestuario.model.test;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAluguelVestuario.model.domain.Cliente;
import br.edu.infnet.appAluguelVestuario.model.exceptions.CpfInvalidoException;
import br.edu.infnet.appAluguelVestuario.model.service.ClienteService;

@Component
@Order(2)
public class ClienteTeste implements ApplicationRunner{

	@Autowired
	private ClienteService clienteService;
	
	@Override
	public void run(ApplicationArguments args) {
		System.out.println("#Inserindo Clientes");
		
		try {
			Cliente c1 = new Cliente("Leandro", "11111111111", LocalDateTime.of(1981, 9, 9, 0, 0));
			clienteService.incluir(c1);			
		} catch (CpfInvalidoException e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		try {
			Cliente c2 = new Cliente("Gabriel", "22222222222", LocalDateTime.of(2007, 10, 01, 0, 0));
			clienteService.incluir(c2);			
		} catch (CpfInvalidoException e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		try {
			Cliente c3 = new Cliente("Enilda", "33333333333", LocalDateTime.of(1948, 10, 11, 0, 0));
			clienteService.incluir(c3);			
		} catch (CpfInvalidoException e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		try {
			Cliente c4 = new Cliente("João", null, LocalDateTime.of(1950, 1, 1, 0, 0));
			clienteService.incluir(c4);			
		} catch (Exception e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		try {
			Cliente c5 = new Cliente("Maria", "", LocalDateTime.of(1960, 1, 1, 0, 0));
			clienteService.incluir(c5);			
		} catch (Exception e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
	}	
}
