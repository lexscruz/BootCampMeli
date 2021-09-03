package praintegradoradois.execiciotres;

public class Cachorro extends Animal implements Carnivoro {

    @Override
    public void emitirSom() {
        System.out.println("auau");
    }

    @Override
    public void comerMeat() {
        System.out.println("Comendo carne.");
    }

    @Override
    public void comerAnimal(Animal animal) {
        if (animal instanceof Gato){
            System.out.println("Comendo um gato");
        }else if (animal instanceof Vaca){
            System.out.println("Comendo uma vaca.");
        }else{
            System.out.println("Comendo um animal qualquer");
        }

    }
}
