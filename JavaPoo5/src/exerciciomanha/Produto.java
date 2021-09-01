package exerciciomanha;

public class Produto {

//    Crie uma classe Product que possua os seguintes atributos: String name e double price, deve
//    definir os métodos getters e setters para seus atributos, um construtor que recebe todos os
//    seus atributos como parâmetro e o método toString (). Crie o método calcule () para o qual
//    iremos passar um parâmetro do tipo int chamado quantidadeOfProdutos; Este método tem
//    que multiplicar o preço pela quantidade de produtos anteriores.

    protected String name;
    protected double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    protected double calcularProduto(int qtdDeProduto){
        return (double)qtdDeProduto * getPrice();
    }

    public Produto(){

    }

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return " Nome: " + name + "\n Preço: " + price;
    }


}


