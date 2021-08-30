package exerciciotarde;

import java.util.Random;

public class ExercicioQuatro {
    public static void main(String[] args) {

        Random rd = new Random();
        int ttTresJornais = 0;
        int ttAC = 0;
        int ttAB = 0;
        int ttBC = 0;
        int ttA = 0;
        int nAssinantes = 0;

        for (int i = 0; i < 50; i++){

            boolean tresJornais = rd.nextBoolean(),
                    jornaisAC = rd.nextBoolean(),
                    jornaisAB = rd.nextBoolean(),
                    jornaisBC = rd.nextBoolean(),
                    jornalA = rd.nextBoolean();


            if(jornaisAB && jornaisBC) {
                ttTresJornais++;
            }else if (jornalA){
                ttA++;
            }else if (jornaisAB){
                ttAB++;
            }else if (jornaisBC){
                ttBC++;
            }else if (jornaisAC) {
                ttAC++;
            }else{
                nAssinantes++;
            }
        }
        System.out.println(" " + ttTresJornais + " pessoas são assinantes dos 3 jornais.");
        System.out.println(" " + ttAC + " pessoas são assinantes do Diário A e do Diário C.");
        System.out.println(" " + ttAB + " pessoas são assinantes do Diário A e do Diário B.");
        System.out.println(" " + ttBC + " pessoas são assinantes do Diário B e do Diário C.");
        System.out.println(" " + ttA + " pessoas são assinantes do jornal A.");
        System.out.println(" " + nAssinantes + " pessoas não são assinates de nenhum jornal digital.");//coloquei essa opção adicional apenas para que possa identificar as 50 pessoas da pesquisa.
    }
}