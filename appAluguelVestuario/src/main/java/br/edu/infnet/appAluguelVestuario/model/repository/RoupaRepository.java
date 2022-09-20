package br.edu.infnet.appAluguelVestuario.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appAluguelVestuario.model.domain.Roupa;

@Repository
public interface RoupaRepository extends CrudRepository<Roupa, Integer>{

}
