package exerciciotarde;

import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Informe o valor do produto");
        double valorProduto = ent.nextDouble();

        System.out.println("Informe a fábrica");
        int fabrica = ent.nextInt();

        double custoEnvio = 0;

        switch(fabrica){
            case 1:
                custoEnvio = (valorProduto * 7)/100;
                break;
            case 2:
                custoEnvio = (valorProduto * 15)/100;
                break;
            case 3:
                custoEnvio = (valorProduto * 22)/100;
                break;
            default:
                System.out.println("Não escolheu nenhuma fábrica");
        }

        double valorEnvio = valorProduto + custoEnvio;

        double valorLucro = (valorEnvio * 25)/100;

        double precoVenda =  valorEnvio + valorLucro;

        System.out.println("% de envio: " + valorEnvio);
        System.out.println("% de lucro: " + valorLucro);
        System.out.println("Valor Total: " + precoVenda);


    }
}