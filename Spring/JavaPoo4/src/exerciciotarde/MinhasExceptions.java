package exerciciotarde;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;;

public class MinhasExceptions{

    public static void lerArquivo(String nomeArquivo) throws FileNotFoundException, IOException{
        String texto = null;
        BufferedReader bufferedReader = new BufferedReader( new FileReader(nomeArquivo));

        while((texto = bufferedReader.readLine()) != null){
            System.out.println(texto);
        }
        bufferedReader.close();
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try {
            int division = b / a;
            System.out.println("Ocorreu um erro.");
        }catch(Exception e){
            System.out.println("Não pode ser divido por zero.");
        } finally {
            System.out.println("Programa finalizado");
        }
        String mensagemFinal = "Esta é a última mensagem";

        int[] numeros = new int[5];

        try{
            numeros[5] = 10;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(" --------- ERRO VOLTE CINCO CASAS -----------");
        }
        finally{
            System.out.println(mensagemFinal);
        }
        try {
            lerArquivo("leia-se");
        }catch(FileNotFoundException f){
            System.out.println("O arquivo especificado não foi encontrado.");
        }catch(IOException io){
            System.out.println("Erro ao ler arquivo especifícado.");
        }


    }








}

