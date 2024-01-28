package br.com.buscafrete.BuscaFrete.service.transportadora;

import br.com.buscafrete.BuscaFrete.domain.motorista.Motorista;
import br.com.buscafrete.BuscaFrete.domain.motorista.MotoristaDTO;
import br.com.buscafrete.BuscaFrete.domain.transportadora.Transportadora;
import br.com.buscafrete.BuscaFrete.domain.transportadora.TransportadoraDTO;
import br.com.buscafrete.BuscaFrete.repositories.transportadora.ITransportadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportadoraService {

    @Autowired
    ITransportadoraRepository iTransportadoraRepository;
    public Transportadora salvar (TransportadoraDTO transportadoraDTO){
        Transportadora transportadora = new Transportadora(transportadoraDTO);
        iTransportadoraRepository.save(transportadora);
        return  transportadora;
    }

    public List<Transportadora> getAll(){
       return iTransportadoraRepository.findAll();
    }

    public Transportadora getByID(String id){
        return iTransportadoraRepository.findById(id).orElse(null);
    }

    public  Transportadora update (String id , TransportadoraDTO transportadoraDTO){
        Transportadora transportadora = getByID(id);
        transportadora.setNome(transportadoraDTO.nome());
        transportadora.setCidade(transportadoraDTO.cidade());
        iTransportadoraRepository.save(transportadora);
        return transportadora;
    }

    public void delete(String id){
        iTransportadoraRepository.deleteById(id);

    }
}
