package br.edu.infnet.appAluguelVestuario.model.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appAluguelVestuario.model.domain.Roupa;
import br.edu.infnet.appAluguelVestuario.model.test.AppImpressao;

@Controller
public class RoupaController {
	
	private static Map<Integer, Roupa> mapaRoupa = new HashMap<Integer, Roupa>();
	private static Integer id = 1;
	
	public static void incluir(Roupa roupa)	{
		
		roupa.setId(id++);
		mapaRoupa.put(roupa.getId(), roupa);
		
		AppImpressao.relatorio("Inclusão da roupa " + roupa.getNome() + " realizada com sucesso", roupa);
	}
	
	public static Collection<Roupa> obterLista(){
		return mapaRoupa.values();
	}
	
	public static void excluir(Integer id) {
		mapaRoupa.remove(id);
	}
	
	@GetMapping(value = "/roupa/lista")
	public String telaLista(Model model) {
					
		model.addAttribute("listagem", obterLista());
		
		return "roupa/lista";
	}

	@GetMapping(value = "/roupa/{id}/excluir")
	public String exclusao(@PathVariable Integer id){
		
		excluir(id);
		
		return "redirect:/roupa/lista";
	}
}
