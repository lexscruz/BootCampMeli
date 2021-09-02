package praintegradoradois.exerciciodois;

public class Endereco {

    private String endereco;
    private Integer numero;
    private String cep;

    public Endereco(String endereco, Integer numero, String cep) {
        this.endereco = endereco;
        this.numero = numero;
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }




}