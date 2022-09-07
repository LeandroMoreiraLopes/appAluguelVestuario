package br.edu.infnet.appAluguelVestuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appAluguelVestuario.model.service.AcessorioService;

@Controller
public class AcessorioController {
	
	@Autowired
	private AcessorioService acessorioService;
	
	@GetMapping(value = "/acessorio/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", acessorioService.obterLista());
		
		return "acessorio/lista";
	}
	
	@GetMapping(value = "/acessorio/{id}/excluir")
	public String excluir(@PathVariable Integer id){
		
		acessorioService.excluir(id);
		
		return "redirect:/acessorio/lista";
	}
}