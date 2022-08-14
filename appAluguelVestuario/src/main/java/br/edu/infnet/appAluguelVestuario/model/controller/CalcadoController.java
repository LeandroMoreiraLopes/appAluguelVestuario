package br.edu.infnet.appAluguelVestuario.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalcadoController {
	
	@GetMapping(value = "/calcado/lista")
	public String telaLista() {
		return "calcado/lista";
	}

}
