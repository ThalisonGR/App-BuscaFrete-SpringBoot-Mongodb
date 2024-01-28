package br.com.buscafrete.BuscaFrete.domain.transportadora;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;

@Document(collection = "transportadora")
public class Transportadora {


    @Id
    private  String id;
    private String nome;
    private String cidade;

    public  Transportadora(){

    }
    public Transportadora(TransportadoraDTO transportadoraDTO) {
        this.nome = transportadoraDTO.nome();
        this.cidade = transportadoraDTO.cidade();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
