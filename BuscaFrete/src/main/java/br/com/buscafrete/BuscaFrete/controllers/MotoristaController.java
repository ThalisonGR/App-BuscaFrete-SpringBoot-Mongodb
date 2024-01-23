package br.com.buscafrete.BuscaFrete.controllers;

import br.com.buscafrete.BuscaFrete.domain.motorista.Motorista;
import br.com.buscafrete.BuscaFrete.domain.motorista.MotoristaDTO;
import br.com.buscafrete.BuscaFrete.service.motorista.MotoristaService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/api/motorista")
public class MotoristaController {

    @Autowired
    MotoristaService service;

    @PostMapping(value = "/inserir")
    public ResponseEntity<Motorista> insert (@RequestBody MotoristaDTO motoristaDTO){
        Motorista newMotorista = service.salvar(motoristaDTO);
        return  ResponseEntity.ok().body(newMotorista);
    }

    @GetMapping("/consultaAll")
    public ResponseEntity<List<Motorista>> getAll() {
        List<Motorista> mlista = service.getAll();
        return ResponseEntity.ok().body(mlista);
    }

    @GetMapping("/getByID/{id}")
    public ResponseEntity<Motorista> getByID(@PathParam("id") String id){
        Motorista mLista = service.getByID(id);
        return ResponseEntity.ok().body(mLista);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Motorista> update(@PathParam("id") String id, @RequestBody MotoristaDTO motoristaDTO){
        Motorista upMotorista = service.update(id , motoristaDTO);
        return  ResponseEntity.ok().body(upMotorista);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity <Boolean> delete(@PathParam("id") String id){
        boolean delete = service.delete(id);
        if (delete){
            return  new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
