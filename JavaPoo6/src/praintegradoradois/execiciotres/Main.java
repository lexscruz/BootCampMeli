package praintegradoradois.execiciotres;

public class Main {

    public static void main(String[] args) {

        Vaca vaca = new Vaca();
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        vaca.emitirSom();
        gato.emitirSom();
        cachorro.emitirSom();

        System.out.println("-------------------------------------");

        vaca.comerHerb();
        gato.comerMeat();
        cachorro.comerMeat();

        System.out.println("-------------------------------------");

        cachorro.comerAnimal(gato);
        gato.comerAnimal(cachorro);



    }


}