package br.com.buscafrete.BuscaFrete.controllers;

import br.com.buscafrete.BuscaFrete.domain.postagemCarga.PostagemCarga;
import br.com.buscafrete.BuscaFrete.domain.postagemCarga.PostagemCargaDTO;
import br.com.buscafrete.BuscaFrete.service.postagemCarga.PostagemCargaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/postagemCargas")
public class PostagemCargaController {

    @Autowired
    PostagemCargaService postagemCargaService;

    @PostMapping("/inserir")
    public ResponseEntity<PostagemCarga> inserir(@RequestBody PostagemCargaDTO postagemCargaDTO) {
        PostagemCarga postagemCarga = postagemCargaService.salvar(postagemCargaDTO);
        return ResponseEntity.ok().body(postagemCarga);
    }

    @GetMapping("/consultaAll")
    public ResponseEntity <List<PostagemCarga>> getAll(){
        List<PostagemCarga> postagem = postagemCargaService.getAll();
        return ResponseEntity.ok().body(postagem);
    }

    @GetMapping("/consulta/{id}")
    public ResponseEntity <PostagemCarga> getByID(@PathVariable String id){
        PostagemCarga postagemCarga = postagemCargaService.getByID(id);
        return ResponseEntity.ok().body(postagemCarga);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<PostagemCarga> update(@PathVariable String id , @RequestBody PostagemCargaDTO postagemCargaDTO){
        PostagemCarga postagemCarga = postagemCargaService.update(id, postagemCargaDTO);
        return ResponseEntity.ok().body(postagemCarga);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity <Boolean> delete(@PathVariable String id){
        boolean delete = postagemCargaService.delete(id);
        if (delete){
            return  new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
