package exerciciotarde;

public class Veiculo {

    private String modelo;
    private String marca;
    private double custo;
    private double preco;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCusto() {
        return custo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public Veiculo() {
    }

    public Veiculo(String modelo, String marca, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public String toString(){
        return " Marca: " + modelo + "\n Marca: " + marca + "\n Preço: " + preco;
    }
}

