package exerciciotarde;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String escolha = "sim";

        while(escolha.equals("sim")){
            System.out.println("Digite o RG: ");
            int rg = ent.nextInt();

            System.out.println("Informe o salário: ");
            double salario = ent.nextDouble();

            if (salario <= 20000){
                salario += (salario * 20)/100;
            }else if (salario >= 20000 && salario <= 45000){
                salario += (salario *10)/100;
            }else {
                salario += (salario * 5)/100;
            }
            System.out.printf("Salario com aumento ficou: %.2f \n", salario);

            System.out.println("Deseja continuar? ");
            escolha = ent.next();
        }

    }
}