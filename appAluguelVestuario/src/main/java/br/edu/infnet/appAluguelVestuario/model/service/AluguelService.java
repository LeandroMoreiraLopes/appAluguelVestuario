package br.edu.infnet.appAluguelVestuario.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appAluguelVestuario.model.domain.Aluguel;
import br.edu.infnet.appAluguelVestuario.model.test.AppImpressao;

@Service
public class AluguelService {
	
	private static Map<Integer, Aluguel> mapaAluguel = new HashMap<Integer, Aluguel>();
	private static Integer id = 1;
	
	public void incluir(Aluguel aluguel)	{
		
		aluguel.setId(id++);
		mapaAluguel.put(aluguel.getId(), aluguel);
		
		AppImpressao.relatorio("Inclusão do aluguel " + aluguel.getItemAlugado() + " realizada com sucesso", aluguel);
	}
	
	public Collection<Aluguel> obterLista(){
		return mapaAluguel.values();
	}
	
	public void excluir(Integer id) {
		mapaAluguel.remove(id);
	}

}
