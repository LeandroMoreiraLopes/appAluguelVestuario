package br.edu.infnet.appAluguelVestuario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VestuarioController {
	
	@GetMapping(value = "/vestuario/lista")
	public String telaLista() {
		return "vestuario/lista";
	}

}
