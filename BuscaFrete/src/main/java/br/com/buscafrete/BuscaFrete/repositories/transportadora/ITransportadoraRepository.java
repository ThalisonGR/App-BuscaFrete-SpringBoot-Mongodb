package br.com.buscafrete.BuscaFrete.repositories.transportadora;

import br.com.buscafrete.BuscaFrete.domain.transportadora.Transportadora;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITransportadoraRepository extends MongoRepository<Transportadora , String> {
}
