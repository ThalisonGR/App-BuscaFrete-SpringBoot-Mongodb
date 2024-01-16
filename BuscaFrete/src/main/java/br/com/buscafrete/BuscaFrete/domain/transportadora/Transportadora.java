package br.com.buscafrete.BuscaFrete.domain.transportadora;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;

@Document(collection = "transportadora")
public class Transportadora {

    @Id
    private  String Id;
    private String nome;
    private String cidade;

    public Transportadora(String id, String nome, String cidade) {
        Id = id;
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
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
