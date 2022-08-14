package br.edu.infnet.appAluguelVestuario.model.test;

import br.edu.infnet.appAluguelVestuario.model.domain.Vestuario;

public class AppVestuario {
	private String mensagem;
	
	public AppVestuario(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public void relatorio(Vestuario vestuario)	{
		System.out.println(mensagem);
		vestuario.impressao();
	}	
}
