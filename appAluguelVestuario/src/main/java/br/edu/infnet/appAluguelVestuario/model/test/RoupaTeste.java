package br.edu.infnet.appAluguelVestuario.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAluguelVestuario.model.domain.Roupa;

@Component
public class RoupaTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Roupas");
		
		Roupa r1 = new Roupa();
		r1.tamanho = "Paletó Summer";
		r1.tipoDeTecido = "Poliéster";
		r1.paraNoite = false;
		System.out.println(r1);
		
		Roupa r2 = new Roupa();
		r2.tamanho = "Paletó Black";
		r2.tipoDeTecido = "Brim";
		r2.paraNoite = false;
		System.out.println(r2);
		
		Roupa r3 = new Roupa();
		r3.tamanho = "Vestido Floral";
		r3.tipoDeTecido = "Veludo";
		r3.paraNoite = true;
		System.out.println(r3);			
	}	
}
