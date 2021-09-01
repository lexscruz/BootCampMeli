package exerciciomanha;

public class NaoPereciveis extends Produto{
//    Crie a classe NonPerishable, ela terá um atributo chamado type, será um String, crie setters,
//    getters, constructor e método toString (); nesta classe, o método calcule () fará exatamente o
//    mesmo que na classe Produto.

    private String tipo;

    public NaoPereciveis(){
    }

    public NaoPereciveis(String tipo) {
        this.tipo = tipo;
    }

    public NaoPereciveis(String name, double price, String tipo) {
        super(name, price);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return super.toString() + "\n Tipo: " + tipo;
    }

    protected double calcularProduto(int qtdDeProduto){
        return (double)qtdDeProduto * getPrice();
    }
}

