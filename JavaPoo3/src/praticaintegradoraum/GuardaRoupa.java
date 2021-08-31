package praticaintegradoraum;

import java.util.*;

public class GuardaRoupa {

    int count = 0;
    Map<Integer, List<Roupa>> guardaRoupa = new HashMap<>();

    public Integer guardarRoupa(List<Roupa> listaDeRoupas){

        guardaRoupa.put(++count, listaDeRoupas);
        return count;
    }

    public List<Roupa> devolveRoupa(int num){
        List<Roupa> roupa = guardaRoupa.get(num);
        guardaRoupa.remove(num);
        return roupa;
    }

    public void mostrarRoupas(){
        for (Integer count : guardaRoupa.keySet()) {
            List < Roupa > listaRoupas = guardaRoupa.get(count);
            for (Roupa lista: listaRoupas) {
                System.out.println(lista.toString());
            }
        }
    }

}