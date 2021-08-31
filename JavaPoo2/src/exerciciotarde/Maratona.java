package exerciciotarde;

import java.util.HashMap;
import java.util.Map;

public class Maratona {

    Map<Integer, Participante> pequenoCircuito = new HashMap<Integer, Participante>();
    Map<Integer, Participante> circuitoMedio = new HashMap<Integer, Participante>();
    Map<Integer, Participante> circuitoAvancado = new HashMap<Integer, Participante>();
    int inscricao = 1;

    //Inscreve maratonista
    public void inscreveMaratonista(String categoria, Participante participante) {
        switch (categoria) {
            case "pequeno":
                pequenoCircuito.put(inscricao++, participante);
                if (participante.getIdade() < 18) {
                    participante.setValorInscricao(1300.00);
                } else {
                    participante.setValorInscricao(1500.00);
                }
                break;
            case "médio":
                circuitoMedio.put(inscricao++, participante);
                if (participante.getIdade() < 18) {
                    participante.setValorInscricao(2000.00);
                } else {
                    participante.setValorInscricao(2300.00);
                }
                break;
            case "avançado":
                circuitoAvancado.put(inscricao++, participante);
                if (participante.getIdade() < 18) {
                    System.out.println("Não é possível efetuar a inscrição de " +
                            "menor de idade na modalidade Circuito Avançado.");
                } else {
                    participante.setValorInscricao(2800.00);
                }
                break;
            default:
                System.out.println("Nenhuma das opções foram escolhidas.");
        }
    }
    public void mostraListaCategoria(String categoria){
        switch (categoria){
            case "pequeno":
                System.out.println("\n----------------- Categoria Pequeno Circuito ------------------");
                for (Map.Entry<Integer, Participante> entry : pequenoCircuito.entrySet()){
                    System.out.println(entry.getKey() + " - " + entry.getValue().toString());
                }
                break;
            case "médio":
                System.out.println("\n----------------- Categoria Médio Circuito ------------------");
                for (Map.Entry<Integer, Participante> entry : circuitoMedio.entrySet()){
                    System.out.println(entry.getKey() + " - " + entry.getValue().toString());
                }
                break;
            case "avançado":
                System.out.println("\n----------------- Categoria Circuito Avançado------------------");
                for (Map.Entry<Integer, Participante> entry : circuitoAvancado.entrySet()){
                    System.out.println(entry.getKey() + " - " + entry.getValue().toString());
                }
                break;
            default:
                System.out.println("");
        }
    }

    public void cancelaInscricao(String categoria, int numeroInscricao){
        switch (categoria){
            case "pequeno":
                pequenoCircuito.remove(numeroInscricao);
                break;
            case "médio":
                circuitoMedio.remove(numeroInscricao);
                break;
            case "avançado":
                circuitoAvancado.remove(numeroInscricao);
                break;
            default:
                System.out.println("Não escolhido nenhuma opção válida.");
        }
    }
}
