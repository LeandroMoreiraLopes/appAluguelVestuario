package br.edu.infnet.appAluguelVestuario.model.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appAluguelVestuario.model.domain.Calcado;
import br.edu.infnet.appAluguelVestuario.model.test.AppImpressao;

@Controller
public class CalcadoController {
	
	private static Map<Integer, Calcado> mapaCalcado = new HashMap<Integer, Calcado>();
	private static Integer id = 1;
	
	public static void incluir(Calcado calcado)	{
		
		calcado.setId(id++);
		mapaCalcado.put(calcado.getId(), calcado);
		
		AppImpressao.relatorio("Inclusão do calçado " + calcado.getNome() + " realizada com sucesso", calcado);
	}
	
	public static Collection<Calcado> obterLista(){
		return mapaCalcado.values();
	}
	
	public static void excluir(Integer id) {
		mapaCalcado.remove(id);
	}
	
	@GetMapping(value = "/calcado/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "calcado/lista";
	}
	
	@GetMapping(value = "/calcado/{id}/excluir")
	public String exclusao(@PathVariable Integer id){
		
		excluir(id);
		
		return "redirect:/calcado/lista";
	}
}
