package br.edu.infnet.appAluguelVestuario.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appAluguelVestuario.model.domain.Cliente;
import br.edu.infnet.appAluguelVestuario.model.test.AppImpressao;

@Service
public class ClienteService {
	
	private static Map<Integer, Cliente> mapaCliente = new HashMap<Integer, Cliente>();
	private static Integer id = 1;
	
	public void incluir(Cliente cliente)	{
		
		cliente.setId(id++);
		mapaCliente.put(cliente.getId(), cliente);
		
		AppImpressao.relatorio("Inclusão de cliente " + cliente.getNome() + " realizada com sucesso", cliente);
	}
	
	public Collection<Cliente> obterLista(){
		return mapaCliente.values();
	}
	
	public void excluir(Integer id) {
		mapaCliente.remove(id);
	}

}
