package br.com.buscafrete.BuscaFrete.repositories.postagemCarga;

import br.com.buscafrete.BuscaFrete.domain.postagemCarga.PostagemCarga;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostagemCarga extends MongoRepository<PostagemCarga ,String> {
}
