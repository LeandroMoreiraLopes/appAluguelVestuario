package br.edu.infnet.appAluguelVestuario.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appAluguelVestuario.model.domain.Vestuario;

@Service
public class VestuarioService {
	
	@Autowired
	private RoupaService roupaService;
	
	@Autowired
	private CalcadoService calcadoService;
	
	@Autowired
	private AcessorioService acessorioService;
	
	public List<Vestuario> obterLista(){
		List<Vestuario> vestuarios = new ArrayList<Vestuario>();
		
		vestuarios.addAll(roupaService.obterLista());
		vestuarios.addAll(calcadoService.obterLista());
		vestuarios.addAll(acessorioService.obterLista());
		
		return vestuarios;
	}
}
