package br.com.buscafrete.BuscaFrete.service.postagemCarga;

import br.com.buscafrete.BuscaFrete.domain.postagemCarga.PostagemCarga;
import br.com.buscafrete.BuscaFrete.domain.postagemCarga.PostagemCargaDTO;
import br.com.buscafrete.BuscaFrete.repositories.postagemCarga.IPostagemCarga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostagemCargaService {

    @Autowired
    IPostagemCarga iPostagemCarga;
    public PostagemCarga salvar(PostagemCargaDTO postagemCargaDTO){
        PostagemCarga postagemCarga = new PostagemCarga(postagemCargaDTO);
        iPostagemCarga.save(postagemCarga);
        return postagemCarga;
    }

    public  PostagemCarga update(String id ,PostagemCargaDTO postagemCargaDTO){
        PostagemCarga postagem = getByID(id);
        postagem.setOrigemCarga(postagemCargaDTO.origemCarga());
        postagem.setDestinoCarga(postagem.getDestinoCarga());
        postagem.setPesoTonelada(postagemCargaDTO.pesoTonelada());
        postagem.setValorFrete(postagemCargaDTO.valorFrete());
        return postagem;
    }

    public List<PostagemCarga> getAll(){
        List<PostagemCarga> postagemCargas = iPostagemCarga.findAll();
        return postagemCargas;
    }

    public PostagemCarga getByID(String id){
        PostagemCarga postagemCarga = iPostagemCarga.findById(id).orElse(null);
        return  postagemCarga;
    }

    public void delete(String id){
        iPostagemCarga.deleteById(id);
    }

}
