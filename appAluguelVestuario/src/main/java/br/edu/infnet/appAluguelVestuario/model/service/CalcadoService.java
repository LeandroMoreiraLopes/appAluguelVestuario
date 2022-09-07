package br.edu.infnet.appAluguelVestuario.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appAluguelVestuario.model.domain.Calcado;
import br.edu.infnet.appAluguelVestuario.model.test.AppImpressao;

@Service
public class CalcadoService {
	
	private static Map<Integer, Calcado> mapaCalcado = new HashMap<Integer, Calcado>();
	private static Integer id = 1;
	
	public void incluir(Calcado calcado)	{
		
		calcado.setId(id++);
		mapaCalcado.put(calcado.getId(), calcado);
		
		AppImpressao.relatorio("Inclusão do calçado " + calcado.getNome() + " realizada com sucesso", calcado);
	}
	
	public Collection<Calcado> obterLista(){
		return mapaCalcado.values();
	}
	
	public void excluir(Integer id) {
		mapaCalcado.remove(id);
	}
}