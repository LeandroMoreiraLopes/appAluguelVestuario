package br.edu.infnet.appAluguelVestuario.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appAluguelVestuario.model.domain.Roupa;
import br.edu.infnet.appAluguelVestuario.model.test.AppImpressao;

@Service
public class RoupaService {
	
	private static Map<Integer, Roupa> mapaRoupa = new HashMap<Integer, Roupa>();
	private static Integer id = 1;
	
	public void incluir(Roupa roupa)	{
		
		roupa.setId(id++);
		mapaRoupa.put(roupa.getId(), roupa);
		
		AppImpressao.relatorio("Inclusão da roupa " + roupa.getNome() + " realizada com sucesso", roupa);
	}
	
	public Collection<Roupa> obterLista(){
		return mapaRoupa.values();
	}
	
	public void excluir(Integer id) {
		mapaRoupa.remove(id);
	}
}
