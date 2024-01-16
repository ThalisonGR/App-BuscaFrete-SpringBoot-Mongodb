package br.com.buscafrete.BuscaFrete.repositories;

import br.com.buscafrete.BuscaFrete.domain.motorista.Motorista;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMotoristaRepository extends MongoRepository <Motorista , String> {
}
