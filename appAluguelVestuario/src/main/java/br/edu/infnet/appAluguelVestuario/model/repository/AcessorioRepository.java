package br.edu.infnet.appAluguelVestuario.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appAluguelVestuario.model.domain.Acessorio;

@Repository
public interface AcessorioRepository extends CrudRepository<Acessorio, Integer>{

}
