package br.com.alura.listavip.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.listavip.model.Convidado;

@Repository
public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {

	List<Convidado> findByNome(String nome);
}
