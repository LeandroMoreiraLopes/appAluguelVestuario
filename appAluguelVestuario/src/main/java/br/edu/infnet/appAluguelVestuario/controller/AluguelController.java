package br.edu.infnet.appAluguelVestuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appAluguelVestuario.model.domain.Usuario;
import br.edu.infnet.appAluguelVestuario.model.service.AluguelService;
import br.edu.infnet.appAluguelVestuario.model.service.ClienteService;
import br.edu.infnet.appAluguelVestuario.model.service.VestuarioService;

@Controller
public class AluguelController {
	
	@Autowired
	private AluguelService aluguelService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private VestuarioService vestuarioService;
	
	@GetMapping(value = "/aluguel")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("clientes", clienteService.obterLista(usuario));
		model.addAttribute("vestuarios", vestuarioService.obterLista(usuario));
		
		return "aluguel/cadastro";
	}
	
	@GetMapping(value = "/aluguel/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", aluguelService.obterLista());
		
		return "aluguel/lista";
	}
	
	@PostMapping(value = "/aluguel/incluir")
	public String incluir(){
		
		
		return "redirect:/aluguel/lista";
	}
	
	@GetMapping(value = "/aluguel/{id}/excluir")
	public String excluir(@PathVariable Integer id){
		
		aluguelService.excluir(id);
		
		return "redirect:/aluguel/lista";
	}
}
