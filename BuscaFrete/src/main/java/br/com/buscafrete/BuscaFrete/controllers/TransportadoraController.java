package br.com.buscafrete.BuscaFrete.controllers;

import br.com.buscafrete.BuscaFrete.domain.motorista.Motorista;
import br.com.buscafrete.BuscaFrete.domain.transportadora.Transportadora;
import br.com.buscafrete.BuscaFrete.domain.transportadora.TransportadoraDTO;
import br.com.buscafrete.BuscaFrete.service.motorista.MotoristaService;
import br.com.buscafrete.BuscaFrete.service.transportadora.TransportadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/api/transportadora")
public class TransportadoraController {

    @Autowired
    TransportadoraService transportadoraService;

    @PostMapping("/inserir")
    public  ResponseEntity<Transportadora> inserir(@RequestBody TransportadoraDTO transportadoraDTO){
        Transportadora transportadora = transportadoraService.salvar(transportadoraDTO);
        return  ResponseEntity.ok().body(transportadora);
    }

    @GetMapping("/consultaAll")
    public ResponseEntity<List<Transportadora>> getAll(){
        List<Transportadora>  tList= transportadoraService.getAll();
        return ResponseEntity.ok().body(tList);
    }

    @GetMapping("/consulta/{id}")
    public ResponseEntity<Transportadora> getByID(@PathVariable String id){
        Transportadora transportadora  = transportadoraService.getByID(id);
        return ResponseEntity.ok().body(transportadora);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Transportadora> update(@PathVariable String id , @RequestBody TransportadoraDTO transportadoraDTO){
        Transportadora transportadora = transportadoraService.update(id , transportadoraDTO);
        return ResponseEntity.ok().body(transportadora);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        transportadoraService.delete(id);
        return  ResponseEntity.noContent().build();
    }

}
