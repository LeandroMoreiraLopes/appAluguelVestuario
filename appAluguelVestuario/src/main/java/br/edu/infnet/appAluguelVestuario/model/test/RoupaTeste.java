package br.edu.infnet.appAluguelVestuario.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAluguelVestuario.model.domain.Roupa;

@Component
@Order(3)
public class RoupaTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Roupas");
		
		Roupa r1 = new Roupa();
		r1.setNome("Paletó Summer");
		r1.setValorDoAluguel(1600);
		r1.setQtdDias(2);
		r1.setTamanho("G");
		r1.setTipoDeTecido("Poliéster");
		r1.setParaNoite(false);
		System.out.println(r1);
		
		new AppVestuario("Inclusão da roupa paletó summer").relatorio(r1);
		
		Roupa r2 = new Roupa();
		r2.setNome("Paletó Grafite");
		r2.setValorDoAluguel(650);
		r2.setQtdDias(3);
		r2.setTamanho("M");
		r2.setTipoDeTecido("Brim");
		r2.setParaNoite(false);
		System.out.println(r2);
		
		new AppVestuario("Inclusão da roupa paleto grafite").relatorio(r2);
		
		Roupa r3 = new Roupa();
		r3.setNome("Vestido Floral");
		r3.setValorDoAluguel(500);
		r3.setQtdDias(1);
		r3.setTamanho("P");
		r3.setTipoDeTecido("Veludo");
		r3.setParaNoite(true);
		System.out.println(r3);	
		
		new AppVestuario("Inclusão da roupa vestido floral").relatorio(r3);
	}	
}
