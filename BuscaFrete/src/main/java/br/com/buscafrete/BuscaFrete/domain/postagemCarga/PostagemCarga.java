package br.com.buscafrete.BuscaFrete.domain.postagemCarga;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "postagemCarga")
public class PostagemCarga {

    @Id
    private String id;
    private String origemCarga;
    private String destinoCarga;
    private BigDecimal pesoTonelada;
    private BigDecimal valorFrete;

    public PostagemCarga(PostagemCargaDTO postagemCargaDTO) {
        this.origemCarga = postagemCargaDTO.origemCarga();
        this.destinoCarga = postagemCargaDTO.destinoCarga();
        this.pesoTonelada = postagemCargaDTO.pesoTonelada();
        this.valorFrete = postagemCargaDTO.valorFrete();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrigemCarga() {
        return origemCarga;
    }

    public void setOrigemCarga(String origemCarga) {
        this.origemCarga = origemCarga;
    }

    public String getDestinoCarga() {
        return destinoCarga;
    }

    public void setDestinoCarga(String destinoCarga) {
        this.destinoCarga = destinoCarga;
    }

    public BigDecimal getPesoTonelada() {
        return pesoTonelada;
    }

    public void setPesoTonelada(BigDecimal pesoTonelada) {
        this.pesoTonelada = pesoTonelada;
    }

    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
    }
}
