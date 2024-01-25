package br.com.buscafrete.BuscaFrete.domain.motorista;

import lombok.NoArgsConstructor;
import netscape.javascript.JSObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "motorista")
public class Motorista {

    @Id
    private String id;
    private String nome;
    private String cnpj;
    private String tio_caminhao;

    public Motorista(){

    }
    public Motorista(MotoristaDTO motoristaDTO){

        this.nome = motoristaDTO.nome();
        this.cnpj = motoristaDTO.cnpj();
        this.tio_caminhao = motoristaDTO.tipo_caminhao();
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

    public String getTio_caminhao() {
        return tio_caminhao;
    }

    public void setTio_caminhao(String tio_caminhao) {
        this.tio_caminhao = tio_caminhao;
    }

}
