package exerciciomanha;

public class ExercicioVetoresEMatrizes {
    public static void main(String[] args) {

        String[] cidades = new String[10];
//        String[] cidades = {"londres","Madri","Nova York","Buenos Aires",
//                "Assunção","São Paulo","lima","Santiago de Chile","Lisboa","Tokio"};
        cidades[0] = "londres";
        cidades[1] = "Madri";
        cidades[2] = "Nova York";
        cidades[3] = "Buenos Aires";
        cidades[4] = "Assunção";
        cidades[5] = "São Paulo";
        cidades[6] = "Lima";
        cidades[7] = "Santiago do Chile";
        cidades[8] = "lisboa";
        cidades[9] = "Tokio";

        int[][] temp = new int[10][2];

        temp[0][0] = -2;
        temp[0][1] = 33;

        temp[1][0] = -3;
        temp[1][1] = 32;

        temp[2][0] = 8;
        temp[2][1] = 27;

        temp[3][0] = 4;
        temp[3][1] = 37;

        temp[4][0] = 6;
        temp[4][1] = 42;

        temp[5][0] = 5;
        temp[5][1] = 43;

        temp[6][0] = 0;
        temp[6][1] = 39;

        temp[7][0] = -7;
        temp[7][1] = 26;

        temp[8][0] = -1;
        temp[8][1] = 31;

        temp[9][0] = -10;
        temp[9][1] = 35;

        int maTemp = 0;
        int miTemp = 0;
        String menorTempCidade = "";
        String maiorTempCidade = "";

//          matriz[0].lenght() -> tamanho da caluna
//          matriz.lenght()-> tamanho da linha
        for ( int c = 0; c < cidades.length; c++){
//
            for (int t = 0; t < temp[t].length; t++){

                if(miTemp > temp[c][t]){
                    miTemp = temp[c][t];
                    menorTempCidade = cidades[c];

                }else if (maTemp < temp[c][t] ){
                    maTemp = temp[c][t];
                    maiorTempCidade = cidades[c];
                }
            }

            System.out.println(" " + miTemp + " " + menorTempCidade + " " + maTemp + " " + maiorTempCidade  );

        }

        System.out.println("A menor temperatura é " + miTemp + " em  " + menorTempCidade + " e a maior temperatura é " + maTemp + " em  " + maiorTempCidade  );

    }
}