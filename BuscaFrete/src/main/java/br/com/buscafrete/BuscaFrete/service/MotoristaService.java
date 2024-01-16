package br.com.buscafrete.BuscaFrete.service;


import br.com.buscafrete.BuscaFrete.domain.motorista.Motorista;
import br.com.buscafrete.BuscaFrete.domain.motorista.MotoristaDTO;
import br.com.buscafrete.BuscaFrete.repositories.IMotoristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotoristaService {

    @Autowired
    private IMotoristaRepository iMotoristaRepository;

    public Motorista isenrir (MotoristaDTO motoristaDTO){
        Motorista motorista = new Motorista(motoristaDTO);
        iMotoristaRepository.save(motorista);
        return motorista;
    }
}
