package br.edu.infnet.appAluguelVestuario.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appAluguelVestuario.model.domain.Roupa;
import br.edu.infnet.appAluguelVestuario.model.repository.RoupaRepository;
import br.edu.infnet.appAluguelVestuario.model.test.AppImpressao;

@Service
public class RoupaService {
	@Autowired
	private RoupaRepository roupaRepository;
	
	//private static Map<Integer, Roupa> mapaRoupa = new HashMap<Integer, Roupa>();
	//private static Integer id = 1;
	
	public void incluir(Roupa roupa)	{
		
		roupaRepository.save(roupa);
		
		//roupa.setId(id++);
		//mapaRoupa.put(roupa.getId(), roupa);
		
		AppImpressao.relatorio("Inclusão da roupa " + roupa.getNome() + " realizada com sucesso", roupa);
	}
	
	public Collection<Roupa> obterLista(){
		return (Collection<Roupa>)roupaRepository.findAll();
		
		//return mapaRoupa.values();
	}
	
	public void excluir(Integer id) {
		roupaRepository.deleteById(id);
		//mapaRoupa.remove(id);
	}
}
