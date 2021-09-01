package exerciciomanha;

public class Pereciveis extends Produto{
    //    Crie a classe Perecíveis, que terá um atributo chamado daysPorCaducar do tipo int, já para o
//    produto, defina setters, getters, um construtor que recebe todos os atributos por parâmetro e
//    o método toString (). Esta classe deve herdar de Produto e substituir o método calcular (), que
//    deve fazer o mesmo que a classe Produto (multiplicar o preço pelo número de produtos) e,
//    além disso, reduzir o preço de acordo com daysPerOfDate:
//
//    ● Se você tiver um (1) dia para expirar, o preço final será reduzido 4 vezes.
//    ● Se você tiver dois (2) dias restantes para expirar, o preço final será reduzido 3 vezes.
//    ● Se tiver 3 dias (3) para expirar, ele reduzirá a metade de seu preço final.
    private int diasAVencer;

    public Pereciveis(){
    }
    public Pereciveis(int vencimento) {
        this.diasAVencer = vencimento;
    }

    public Pereciveis(String name, double price, int vencimento) {
        super(name, price);
        this.diasAVencer = vencimento;
    }
    @Override
    public String toString(){
        return super.toString() + "\n Vencimento:  " + diasAVencer;
    }
    @Override
    protected double calcularProduto(int qtdDeProduto){
        double valorProduto = super.calcularProduto(qtdDeProduto);

        switch (diasAVencer){
            case 1:
                valorProduto /= 4;
                break;
            case 2:
                valorProduto /= 3;
                break;
            case 3:
                valorProduto /= 2;
                break;
            default:
                break;
        }

        return valorProduto;


    }
}
