package br.com.buscafrete.BuscaFrete.domain.motorista;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "motorista")
public class Motorista {

    @Id
    private String id;
    private String nome;
    private String cnpj;
    private String tipo_caminhao;

    public Motorista(){

    }
    public Motorista(MotoristaDTO motoristaDTO){

        this.nome = motoristaDTO.nome();
        this.cnpj = motoristaDTO.cnpj();
        this.tipo_caminhao = motoristaDTO.tipo_caminhao();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipo_caminhao() {
        return tipo_caminhao;
    }

    public void setTipo_caminhao(String tipo_caminhao) {
        this.tipo_caminhao = tipo_caminhao;
    }
}
