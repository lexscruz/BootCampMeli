package exerciciomanha;

import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args) {

        int valorDiaCampanha = 2;
        int valorTotalCampanha = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quantos dias será a campanha: ");
        int qtdDiasCampanha = scan.nextInt();

        valorTotalCampanha = valorDiaCampanha * qtdDiasCampanha;

        System.out.println("O valor total da campanha é: " + valorTotalCampanha);


    }
}