package br.edu.infnet.appAluguelVestuario.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appAluguelVestuario.model.domain.Acessorio;
import br.edu.infnet.appAluguelVestuario.model.test.AppImpressao;

@Service
public class AcessorioService {
	
	private static Map<Integer, Acessorio> mapaAcessorio = new HashMap<Integer, Acessorio>();
	private static Integer id = 1;
	
	public void incluir(Acessorio acessorio)	{
		
		acessorio.setId(id++);
		mapaAcessorio.put(acessorio.getId(), acessorio);
		
		AppImpressao.relatorio("Inclusão de acessorio " + acessorio.getNome() + " realizada com sucesso", acessorio);
	}
	
	public Collection<Acessorio> obterLista(){
		return mapaAcessorio.values();
	}
	
	public void excluir(Integer id) {
		mapaAcessorio.remove(id);
	}
}
