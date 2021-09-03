package praintegradoradois.execiciotres;

public class Gato extends Animal implements Carnivoro{

    @Override
    public void emitirSom() {
        System.out.println("miau");
    }

    @Override
    public void comerMeat() {
        System.out.println("Comendo carne.");
    }

    @Override
    public void comerAnimal(Animal animal) {
        if (animal instanceof Cachorro){
            System.out.println("Comendo um cachorro.");
        }else if (animal instanceof Vaca){
            System.out.println("Comendo uma vaca.");
        }else{
            System.out.println("Comendo um animal qualquer.");
        }

    }
}