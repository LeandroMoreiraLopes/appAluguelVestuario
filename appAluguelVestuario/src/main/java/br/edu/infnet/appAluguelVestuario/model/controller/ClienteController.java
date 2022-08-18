package br.edu.infnet.appAluguelVestuario.model.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appAluguelVestuario.model.domain.Cliente;
import br.edu.infnet.appAluguelVestuario.model.test.AppImpressao;

@Controller
public class ClienteController {
	
	private static Map<Integer, Cliente> mapaCliente = new HashMap<Integer, Cliente>();
	private static Integer id = 1;
	
	public static void incluir(Cliente cliente)	{
		
		cliente.setId(id++);
		mapaCliente.put(cliente.getId(), cliente);
		
		AppImpressao.relatorio("Inclusão de cliente " + cliente.getNome() + " realizada com sucesso", cliente);
	}
	
	public static Collection<Cliente> obterLista(){
		return mapaCliente.values();
	}
	
	public static void excluir(Integer id) {
		mapaCliente.remove(id);
	}
	
	@GetMapping(value = "/cliente/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "cliente/lista";
	}
	
	@GetMapping(value = "/cliente/{id}/excluir")
	public String exclusao(@PathVariable Integer id){
		
		excluir(id);
		
		return "redirect:/cliente/lista";
	}

}
