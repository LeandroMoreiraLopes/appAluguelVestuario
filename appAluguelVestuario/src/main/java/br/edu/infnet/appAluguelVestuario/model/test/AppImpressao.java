package br.edu.infnet.appAluguelVestuario.model.test;

import br.edu.infnet.appAluguelVestuario.model.interfaces.IPrinter;

public class AppImpressao {
		public static void relatorio(String mensagem, IPrinter printer)	{
		System.out.println(mensagem);
		
		printer.impressao();
	}	
}
