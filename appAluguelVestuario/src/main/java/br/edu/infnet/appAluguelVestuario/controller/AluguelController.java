package br.edu.infnet.appAluguelVestuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appAluguelVestuario.model.service.AluguelService;

@Controller
public class AluguelController {
	
	@Autowired
	private AluguelService aluguelService;
	
	@GetMapping(value = "/aluguel/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", aluguelService.obterLista());
		
		return "aluguel/lista";
	}
	
	@GetMapping(value = "/aluguel/{id}/excluir")
	public String excluir(@PathVariable Integer id){
		
		aluguelService.excluir(id);
		
		return "redirect:/aluguel/lista";
	}
}