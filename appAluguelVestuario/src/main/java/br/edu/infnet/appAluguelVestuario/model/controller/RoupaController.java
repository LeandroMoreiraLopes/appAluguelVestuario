package br.edu.infnet.appAluguelVestuario.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoupaController {
	
	@GetMapping(value = "/roupa/lista")
	public String telaLista() {
		return "roupa/lista";
	}

}
