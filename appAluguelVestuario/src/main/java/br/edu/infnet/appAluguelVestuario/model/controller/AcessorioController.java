package br.edu.infnet.appAluguelVestuario.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AcessorioController {
	
	@GetMapping(value = "/acessorio/lista")
	public String telaLista() {
		return "acessorio/lista";
	}

}