package br.edu.infnet.appAluguelVestuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appAluguelVestuario.model.service.CalcadoService;

@Controller
public class CalcadoController {
	
	@Autowired
	private CalcadoService calcadoService;
	
	@GetMapping(value = "/calcado/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", calcadoService.obterLista());
		
		return "calcado/lista";
	}
	
	@GetMapping(value = "/calcado/{id}/excluir")
	public String excluir(@PathVariable Integer id){
		
		calcadoService.excluir(id);
		
		return "redirect:/calcado/lista";
	}
}
