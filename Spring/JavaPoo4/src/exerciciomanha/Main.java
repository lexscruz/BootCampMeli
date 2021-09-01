package exerciciomanha;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa pessoa1 = new Pessoa("2","Rafael",23 );
        Pessoa pessoa2 = new Pessoa("3","Pedro", 45, 105.45, 1.85);

        //exerciciomanha.Pessoa pessoa3 = new exerciciomanha.Pessoa("Henrique",45); -  Esta criação de objeto não será
        // permitido devido a não constar um construtors com apenas nome e idade

        System.out.println(pessoa2.toString());

        if (pessoa2.calcularIMC() == -1){
            System.out.println("Seu IMC é abaixo de 20, portanto está abaixo do peso.");
        }else if (pessoa2.calcularIMC() == -0){
            System.out.println("Seu IMC está entre 20 E 25, portanto está no peso correto.");
        }else{
            System.out.println("Seu IMC está acim de 25, portanto está com sobrepeso.");
        }
    }
}