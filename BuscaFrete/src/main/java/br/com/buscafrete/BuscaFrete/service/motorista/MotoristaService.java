package br.com.buscafrete.BuscaFrete.service.motorista;


import br.com.buscafrete.BuscaFrete.domain.motorista.Motorista;
import br.com.buscafrete.BuscaFrete.domain.motorista.MotoristaDTO;
import br.com.buscafrete.BuscaFrete.repositories.motorista.IMotoristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoristaService {

    @Autowired
    private IMotoristaRepository iMotoristaRepository;

    public Motorista salvar (MotoristaDTO motoristaDTO){
        Motorista motorista = new Motorista(motoristaDTO);
        iMotoristaRepository.save(motorista);
        return motorista;
    }

    public List<Motorista> getAll() {
        return  iMotoristaRepository.findAll();
    }

    public Motorista getByID(String id) {
        return iMotoristaRepository.findById(id).orElse(null);

    }

    public Motorista update(String id, MotoristaDTO motoristaDTO) {
        Motorista motorista = iMotoristaRepository.findById(id).orElse(null);
        motorista.setNome(motoristaDTO.nome());
        motorista.setCnpj(motoristaDTO.cnpj());
        motorista.setTio_caminhao(motoristaDTO.tipo_caminhao());
        iMotoristaRepository.save(motorista);
        return  motorista;
    }

    public Boolean delete(String id){
        iMotoristaRepository.deleteById(id);
        return true;
    }
}
