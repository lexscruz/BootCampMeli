package exerciciotarde;

import java.util.Random;


public class ExercicioTres {

    public static void main(String[] args) {

        Random rd =new Random();


        for (int i = 1; i <=7; i++){

            int servico = rd.nextInt(2)+1;
            int cliente = i;

            if(servico == 1){
                System.out.println("Prezado cliente " + cliente + " você possui o nosso Serviço 1 e seu custo este mês é de R$ 1.500.");
            }else if(servico == 2){
                System.out.println("Prezado cliente " + cliente + " você possui o nosso Serviço 2 e seu custo este mês é de R$ 2.200.");
            }else{
                System.out.println("Cliente informou serviço não cadastrado.");
            }

        }
    }
}
