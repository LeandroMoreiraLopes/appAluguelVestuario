package br.edu.infnet.appAluguelVestuario.model.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appAluguelVestuario.model.controller.AluguelController;
import br.edu.infnet.appAluguelVestuario.model.domain.Acessorio;
import br.edu.infnet.appAluguelVestuario.model.domain.Aluguel;
import br.edu.infnet.appAluguelVestuario.model.domain.Calcado;
import br.edu.infnet.appAluguelVestuario.model.domain.Cliente;
import br.edu.infnet.appAluguelVestuario.model.domain.Roupa;
import br.edu.infnet.appAluguelVestuario.model.domain.Vestuario;
import br.edu.infnet.appAluguelVestuario.model.exceptions.AluguelSemVestuarioException;
import br.edu.infnet.appAluguelVestuario.model.exceptions.ClienteNuloException;
import br.edu.infnet.appAluguelVestuario.model.exceptions.CpfInvalidoException;

@Component
@Order(1)
public class AluguelTeste implements ApplicationRunner{
	@Override
	public void run(ApplicationArguments args) {
		System.out.println("#Inserindo Alugueis");
		
		Roupa r1 = new Roupa();
		r1.setNome("Paletó Summer");
		r1.setValorDoAluguel(1600);
		r1.setQtdDias(2);
		r1.setTamanho("G");
		r1.setTipoDeTecido("Poliéster");
		r1.setParaNoite(false);
		Calcado ca1 = new Calcado();
		ca1.setNome("Mocassino");
		ca1.setValorDoAluguel(100.0);
		ca1.setQtdDias(1);
		ca1.setTamanho(38);
		ca1.setTipoDeSalto("Baixo");
		ca1.setCor("Preto");
		Acessorio ac1 = new Acessorio();
		ac1.setNome("Gucci N");
		ac1.setValorDoAluguel(30.0);
		ac1.setQtdDias(3);
		ac1.setDescricao("VX 1300");
		ac1.setTipo("Colar");
		ac1.setMaterial("Prata com brilhantes");
		Acessorio ac2 = new Acessorio();
		ac2.setNome("Gucci N");
		ac2.setValorDoAluguel(30.0);
		ac2.setQtdDias(3);
		ac2.setDescricao("VX 1300");
		ac2.setTipo("Colar");
		ac2.setMaterial("Prata com brilhantes");
		
		//--------------------------
		
		String dir = "C:/Users/llopes/Desktop/Pós MIT Eng de Software/workspace/appAluguelVestuario/appAluguelVestuario/src/main/resources/";
		String arq = "alugueis.txt";
		
		try {
			try {
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha = leitura.readLine();
				while(linha!= null)
				{
					try {
						
						String[] campos = linha.split(";");
						String[] dataEvento = campos[3].split("/");
						String[] dataNasc = campos[6].split("/");
						
						Set<Vestuario> listaVestiario1 = new HashSet<Vestuario>();		
						listaVestiario1.add(r1);
						listaVestiario1.add(ca1);
						listaVestiario1.add(ac1);
						listaVestiario1.add(ac2);
						
						Cliente c1 = new Cliente(campos[4], campos[5], LocalDateTime.of(Integer.parseInt(dataNasc[0]), 
																							Integer.parseInt(dataNasc[1]),
																							Integer.parseInt(dataNasc[2]),
																							0, 0));
						
						Aluguel a1 = new Aluguel(c1, listaVestiario1);
						a1.setItemAlugado(campos[1]);
						a1.setValorTotal(Double.parseDouble(campos[2]));
						a1.setDataEvento(LocalDateTime.of(Integer.parseInt(dataEvento[0]), 
															Integer.parseInt(dataEvento[1]),
															Integer.parseInt(dataEvento[2]),
															19, 0));
						AluguelController.incluir(a1);
					} catch (CpfInvalidoException | ClienteNuloException | AluguelSemVestuarioException e) {
						System.out.println("[ERROR - ALUGUEL] " + e.getMessage());
					}
				
					linha = leitura.readLine();
				}
				
				leitura.close();
				fileReader.close();
			} catch (FileNotFoundException e) {
				System.out.println("[ERRO] O arquivo não existe");
			} catch (IOException e) {
				System.out.println("[ERRO] Problema no fechamento do arquivo");
			}
			
		} finally {
			System.out.println("Arquivo lido");
		}
	}
}
