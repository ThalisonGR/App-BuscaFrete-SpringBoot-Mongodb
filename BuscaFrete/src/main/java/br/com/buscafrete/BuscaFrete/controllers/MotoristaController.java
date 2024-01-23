package br.com.buscafrete.BuscaFrete.controllers;

import br.com.buscafrete.BuscaFrete.domain.motorista.Motorista;
import br.com.buscafrete.BuscaFrete.domain.motorista.MotoristaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value ="/api/motorista")
public class MotoristaController {

    @PostMapping(value = "/inserir")
    public ResponseEntity<Motorista> iserir (@RequestBody MotoristaDTO motoristaDTO){
    return null;
    }
}
