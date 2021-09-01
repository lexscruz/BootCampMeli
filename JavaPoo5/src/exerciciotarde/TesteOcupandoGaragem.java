package exerciciotarde;

import java.util.*;

//        Comece criando uma classe Vehicle com o modelo, marca e atributos de custo, em seguida,
//        crie uma classe garagem com o id ou atributos de identificador exclusivo e uma lista de
//        veículos. Ele também cria os construtores para as classes e métodos Setter e Getter.

//        Faça uma classe Main com o método main para representar um cenário onde a classe
//        garagem é instanciada com uma lista de veículos de acordo com a tabela.

//        Usando o método de ordenação na lista de Veículos com expressões lambda, obtenha uma
//        lista de veículos ordenados por preço do menor ao maior, imprima o resultado na tela.


public class TesteOcupandoGaragem {

    public static void main(String[] args) {

        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Veiculo("Fiesta", "Ford", 1000.0));
        veiculos.add(new Veiculo("Focus", "Ford", 1200.0));
        veiculos.add(new Veiculo("Explorer", "Ford", 2500.0));
        veiculos.add(new Veiculo("Uno", "Fiat", 500.0));
        veiculos.add(new Veiculo("Cronos", "Fiat", 1000.0));
        veiculos.add(new Veiculo("Torino", "Fiat", 1250.0));
        veiculos.add(new Veiculo("Aveo", "Chevrolet", 1250.0));
        veiculos.add(new Veiculo("Spin", "Chevrolet", 2500.0));
        veiculos.add(new Veiculo("Corola", "Toyota", 1200.0));
        veiculos.add(new Veiculo("Fortuner", "Toyota", 3000.0));
        veiculos.add(new Veiculo("Logan", "Renault", 950.0));


        Garagem porteiroDaGaragem = new Garagem(veiculos);


        veiculos.stream().mapToInt((p) -> (int) p.getPreco()).sorted().forEach(System.out::println);

        veiculos.stream().map((marca) -> (String) marca.getMarca()).sorted().forEach(System.out::println);

    }

}

