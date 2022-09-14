package br.edu.infnet.appAluguelVestuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appAluguelVestuario.model.domain.Roupa;
import br.edu.infnet.appAluguelVestuario.model.service.RoupaService;

@Controller
public class RoupaController {
	
	@Autowired
	private RoupaService roupaService;
	
	@GetMapping(value = "/roupa/lista")
	public String telaLista(Model model) {
					
		model.addAttribute("listagem", roupaService.obterLista());
		
		return "roupa/lista";
	}

	@GetMapping(value = "/roupa")
	public String telaCadastro(){
		
		return "roupa/cadastro";
	}
	
	@PostMapping(value = "/roupa/incluir")
	public String incluir(Roupa roupa){
		
		roupaService.incluir(roupa);
		
		return "redirect:/roupa/lista";
	}
	
	@GetMapping(value = "/roupa/{id}/excluir")
	public String excluir(@PathVariable Integer id){
		
		roupaService.excluir(id);
		
		return "redirect:/roupa/lista";
	}
}
