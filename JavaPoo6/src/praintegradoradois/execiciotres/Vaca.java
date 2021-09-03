package praintegradoradois.execiciotres;

public class Vaca extends Animal implements Herbivoro {

    @Override
    public void emitirSom() {
        System.out.println("muuu");
    }

    @Override
    public void comerHerb() {
        System.out.println("Comendo pasto.");
    }
}