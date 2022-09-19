package br.edu.infnet.appAluguelVestuario.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appAluguelVestuario.model.domain.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer>{

}
