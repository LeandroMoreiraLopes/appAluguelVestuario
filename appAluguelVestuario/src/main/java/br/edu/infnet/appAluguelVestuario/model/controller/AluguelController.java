package br.edu.infnet.appAluguelVestuario.model.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appAluguelVestuario.model.domain.Aluguel;
import br.edu.infnet.appAluguelVestuario.model.test.AppImpressao;

@Controller
public class AluguelController {
	
	private static Map<Integer, Aluguel> mapaAluguel = new HashMap<Integer, Aluguel>();
	private static Integer id = 1;
	
	public static void incluir(Aluguel aluguel)	{
		
		aluguel.setId(id++);
		mapaAluguel.put(aluguel.getId(), aluguel);
		
		AppImpressao.relatorio("Inclusão do aluguel " + aluguel.getItemAlugado() + " realizada com sucesso", aluguel);
	}
	
	public static Collection<Aluguel> obterLista(){
		return mapaAluguel.values();
	}
	
	public static void excluir(Integer id) {
		mapaAluguel.remove(id);
	}
	
	@GetMapping(value = "/aluguel/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "aluguel/lista";
	}
	
	@GetMapping(value = "/aluguel/{id}/excluir")
	public String exclusao(@PathVariable Integer id){
		
		excluir(id);
		
		return "redirect:/aluguel/lista";
	}
}
