package br.edu.infnet.appAluguelVestuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appAluguelVestuario.model.service.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping(value = "/cliente/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", clienteService.obterLista());
		
		return "cliente/lista";
	}
	
	@GetMapping(value = "/cliente/{id}/excluir")
	public String excluir(@PathVariable Integer id){
		
		clienteService.excluir(id);
		
		return "redirect:/cliente/lista";
	}

}
