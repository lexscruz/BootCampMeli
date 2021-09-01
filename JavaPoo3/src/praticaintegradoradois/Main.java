package praticaintegradoradois;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Corrida corrida = new Corrida(500.0,1000000.0,"Interlagos", 12);
        Veiculo veiculo = new Veiculo();

        System.out.println("Informe uma categoria: ");
        String categoria = scan.next();

        switch (categoria){
            case "carro":
                corrida.adicionaCarro("plp345",280.0,100.0,45.0);
                corrida.adicionaCarro("Pedro", 260.0,202.0, 8.0);
                corrida.adicionaCarro("FILIPE", 255.0,158.0, 8.0);
                corrida.adicionaCarro("THIAGO",278.0,160.0, 8.0);
                corrida.adicionaCarro("PATRICIA", 281.0,180.0, 8.0);
                corrida.adicionaCarro("ANA", 291.0,179.0, 8.0);
                break;
            case "moto":
                corrida.adicionaMoto("ztk345",360.0,100.0,65.0);
                corrida.adicionaMoto("ptk345",370.0,100.0,65.0);
                corrida.adicionaMoto("gtk345",350.0,100.0,65.0);
                corrida.adicionaMoto("tjk345",380.0,100.0,65.0);
                corrida.adicionaMoto("atk345",330.0,100.0,65.0);
                corrida.adicionaMoto("tuk345",320.0,100.0,65.0);

                break;
        }

        corrida.mostrarVeiculosDaCorrida();

        veiculo = corrida.vencedorCorrida();
        if (veiculo.getPeso() == 1000 && veiculo.getRodas() == 4){
            Carro carro = (Carro) veiculo;
            System.out.println("VENCEDOR " + carro.getPlaca() + " LEVA "+ corrida.getPremioEmDolares() + " dólares");
        }else if(veiculo.getPeso() == 300 && veiculo.getRodas() == 2){
            Moto moto = (Moto) veiculo;
            System.out.println("VENCEDOR " + moto.getPlaca() + " LEVA "+ corrida.getPremioEmDolares() + " dólares");
        }

        corrida.mostrarVeiculosDaCorrida();

        corrida.removerVeiculo(veiculo);

        corrida.mostrarVeiculosDaCorrida();

        if (categoria.equals("carro")){
            corrida.removerVeiculoComPlaca("THIAGO");
        }else {
            corrida.removerVeiculoComPlaca("ztk345");
        }

        corrida.mostrarVeiculosDaCorrida();

        if (categoria.equals("carro")){
            corrida.socorrerCarro("ANA");
        }else {
            corrida.socorrerMoto("gtk345");
        }






    }
}
