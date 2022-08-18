package br.edu.infnet.appAluguelVestuario.model.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appAluguelVestuario.model.domain.Acessorio;
import br.edu.infnet.appAluguelVestuario.model.test.AppImpressao;

@Controller
public class AcessorioController {
	
	private static Map<Integer, Acessorio> mapaAcessorio = new HashMap<Integer, Acessorio>();
	private static Integer id = 1;
	
	public static void incluir(Acessorio acessorio)	{
		
		acessorio.setId(id++);
		mapaAcessorio.put(acessorio.getId(), acessorio);
		
		AppImpressao.relatorio("Inclusão de acessorio " + acessorio.getNome() + " realizada com sucesso", acessorio);
	}
	
	public static Collection<Acessorio> obterLista(){
		return mapaAcessorio.values();
	}
	
	public static void excluir(Integer id) {
		mapaAcessorio.remove(id);
	}
	
	@GetMapping(value = "/acessorio/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "acessorio/lista";
	}
	
	@GetMapping(value = "/acessorio/{id}/excluir")
	public String exclusao(@PathVariable Integer id){
		
		excluir(id);
		
		return "redirect:/acessorio/lista";
	}
}
