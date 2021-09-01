package exerciciotarde;

public class CalculandoMath {

    public void retornaMaior(int num1, int num2){
        System.out.println(Math.max(num2,num1));
    }

    public void retornaMenor(int num1, int num2){
        System.out.println(Math.min(num2,num1));
    }

    public void retornaPotencia(int num1, int num2){
        System.out.println(Math.pow(num2,num1));
    }

    public void retornaCosseno(int num2){
        System.out.println(Math.cos(num2));
    }

    public void retornaRaiz(int num1){
        System.out.println(Math.sqrt(num1));
    }

    public void retornaNumAleatorio(){
        System.out.println(Math.floor(Math.random()*1000));
    }


}