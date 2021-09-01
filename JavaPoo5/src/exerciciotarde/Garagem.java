package exerciciotarde;

//        Comece criando uma classe Vehicle com o modelo, marca e atributos de custo, em seguida,
//        crie uma classe garagem com o id ou atributos de identificador exclusivo e uma lista de
//        veículos. Ele também cria os construtores para as classes e métodos Setter e Getter.

import java.util.ArrayList;
import java.util.List;

public class Garagem {

    private int numGaragem;
    private boolean cobertura;
    private String tipo;
    private List<Veiculo> veiculos;

    public int getNumGaragem() {
        return numGaragem;
    }

    public void setNumGaragem(int numGaragem) {
        this.numGaragem = numGaragem;
    }

    public boolean isCobertura() {
        return cobertura;
    }

    public void setCobertura(boolean cobertura) {
        this.cobertura = cobertura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = new ArrayList<>();
    }

    public Garagem() {
    }

    public Garagem(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public Garagem(int numGaragem, boolean cobertura, String tipo) {
        this.numGaragem = numGaragem;
        this.cobertura = cobertura;
        this.tipo = tipo;
        this.veiculos = new ArrayList<>();
    }

    @Override
    public String toString(){
        return " Número da garagem: " + numGaragem + "\n Tem cobertura: " + cobertura + "\n Garagem de " + tipo;
    }


}

