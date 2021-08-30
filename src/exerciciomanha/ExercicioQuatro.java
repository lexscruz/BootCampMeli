package exerciciomanha;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do prêmio: ");
        double valorPremio = scan.nextDouble();

        double impostoUm = (valorPremio * 2.45) / 100;
        double impostoDois = (valorPremio * 15) / 100;
        double impostoTres = (valorPremio * 3) / 100;

        System.out.printf("%.2f \n", impostoUm);
        System.out.printf("%.2f \n", impostoDois);
        System.out.printf("%.2f \n", impostoTres);

        double valorPremioComDesconto = valorPremio - impostoUm - impostoDois - impostoTres;

        System.out.printf("O valor do prêmio após impostos descontados é: %.2f", valorPremioComDesconto);

    }

    private static double descontoImpostosTotais(double valorPremio) {

        double impUm = impostoDoiseQuarentaCincoPerc(valorPremio);

        double impDois = impostoQuinzePerc(valorPremio);

        double impTres = impostoTresPerc(valorPremio);

        double descontoImpostosTotais = valorPremio - impUm - impDois - impTres;

        return descontoImpostosTotais;
    }

    private static double impostoDoiseQuarentaCincoPerc(double valorPremio) {

        double impostoDoisQuarentaCinco = (valorPremio * 2.45) / 100;

        return impostoDoisQuarentaCinco;
    }

    private static double impostoQuinzePerc(double valorPremio) {

        double impostoQuinze = (valorPremio * 15) / 100;

        return impostoQuinze;

        // return (valorPremio * 15)/100; fazer assim foi dica do intellij, então apartir dessa linha usarei a dica.
    }

    private static double impostoTresPerc(double valorPremio) {

        return (valorPremio * 3) / 100;

    }

}