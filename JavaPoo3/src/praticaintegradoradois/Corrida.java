package praticaintegradoradois;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
/*
    O código comentado faz referencia a minha tentativa de incluir placa para Carro e Moto, conforme solitava o exercicio no meu enetendimento, porém tornou-se bem complexo, posteriormente percebi a facilidade de
    executar a ação, movendo para veículo, assim como Mauri efetuou no exemplo que ele forneceu.
 */
public class Corrida {

    private double distancia;
    private double premioEmDolares;
    private String nome;
    int quantidadeDeVeiculosPermitido;
    private List<Veiculo> gridDaCorrida;
    private SocorristaCarro socorristaCarro;
    private SocorristaMoto socorristaMoto;

    public Corrida(double distancia, double premioEmDolares, String nome, int quantidadeDeVeiculosPermitido) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeDeVeiculosPermitido = quantidadeDeVeiculosPermitido;
        this.socorristaCarro = new SocorristaCarro();
        this.socorristaMoto = new SocorristaMoto();
        this.gridDaCorrida = new ArrayList<>();
    }

    public double getPremioEmDolares() {
        return premioEmDolares;
    }

    //
//    public void adicionaCarro(double velocidade, double aceleracao, double anguloDdeVirada, String placa){
//        if (quantidadeDeVeiculosPermitido > gridDaCorrida.size()){
//            Carro carro = new Carro(velocidade,aceleracao,anguloDdeVirada,placa);
//            if (!gridDaCorrida.contains(carro)){
//                gridDaCorrida.add(carro);
//                System.out.println("Adicionado o carro de placa: " + carro.getPlaca());
//            }else{
//                System.out.println("Carro da placa " + carro.getPlaca() + " já consta inscrito.");
//            }
//        }
//    }
    public void adicionaCarro(String placa, double velocidade, double aceleracao, double anguloDdeVirada){
        if (quantidadeDeVeiculosPermitido > gridDaCorrida.size()){
            Carro carro = new Carro(placa, velocidade,aceleracao,anguloDdeVirada);
            if (!gridDaCorrida.contains(carro)){
                gridDaCorrida.add(carro);
                System.out.println("Adicionado o carro de placa: " + carro.getPlaca());
            }else{
                System.out.println("Carro da placa " + carro.getPlaca() + " já consta inscrito.");
            }
        }
    }

    //    public void adicionaMoto(double velocidade, double aceleracao, double anguloDdeVirada, String placa){
//        if (quantidadeDeVeiculosPermitido > gridDaCorrida.size()){
//            Moto moto = new Moto(velocidade,aceleracao,anguloDdeVirada,placa);
//            if (!gridDaCorrida.contains(moto)){
//                gridDaCorrida.add(moto);
//                System.out.println("Adicionado o carro de placa: " + moto.getPlaca());
//            }else{
//                System.out.println("Moto da placa " + moto.getPlaca() + " já consta inscrito.");
//            }
//        }
//    }
    public void adicionaMoto(String placa, double velocidade, double aceleracao, double anguloDdeVirada){
        if (quantidadeDeVeiculosPermitido > gridDaCorrida.size()){
            Moto moto = new Moto(placa, velocidade,aceleracao,anguloDdeVirada);
            if (!gridDaCorrida.contains(moto)){
                gridDaCorrida.add(moto);
                System.out.println("Adicionado o carro de placa: " + moto.getPlaca());
            }else{
                System.out.println("Moto da placa " + moto.getPlaca() + " já consta inscrito.");
            }
        }
    }

    public void removerVeiculo(Veiculo veiculo){
        Veiculo veiculoASerRemovido = veiculo;
        if (veiculoASerRemovido.getPeso() == 1000 && veiculoASerRemovido.getRodas() == 4){
            gridDaCorrida.remove(veiculoASerRemovido);
        }
        if (veiculoASerRemovido.getPeso() == 300 && veiculoASerRemovido.getRodas() == 2){
            gridDaCorrida.remove(veiculoASerRemovido);
        }

    }

    public void removerVeiculoComPlaca(String placa){
//        String placaVeiculo = placa;
//        for (Veiculo v:
//                gridDaCorrida) {
//            if (v.equals(placaVeiculo))
//            gridDaCorrida.remove(v);
//        }
        for(Veiculo veiculo: gridDaCorrida){
            if (veiculo.getPlaca().equals(placa)){
                gridDaCorrida.remove(veiculo);
                System.out.println("VEÍCULO de "+veiculo.getPlaca() + " REMOVIDO");
                return;
            }
        }
        System.out.println("VEÍCULO NÃO ESTAVA NA CORRIDA");
    }

    //Método para retornar o veículo  vencedor da corrida.
    public Veiculo vencedorCorrida(){
        Veiculo vencedor = new Veiculo();
        if(!gridDaCorrida.isEmpty()) {
            double melhorDesempenho=0;
            for (Veiculo veiculo : gridDaCorrida) {

                if(melhorDesempenho< desempenhoCorrida(veiculo)){
                    melhorDesempenho= desempenhoCorrida(veiculo);
                    vencedor=veiculo;
                }
            }
        }
        return vencedor;
    }

    //Metodo para calcular o desempenho na corrida de cada veículo
    public double desempenhoCorrida(Veiculo veiculo){
        return veiculo.getVelocidade() * 1 / 2 * veiculo.getAceleracao() /(veiculo.getAnguloDeVirada()
                * (veiculo.getPeso() - veiculo.getRodas() * 100));
    }

    public void mostrarVeiculosDaCorrida(){
        System.out.println("*******VEÍCULOS INSCRITOS***********");

        for(int i=0; i < gridDaCorrida.size(); i++) {
            if (gridDaCorrida.get(i).getPeso() == 1000 && gridDaCorrida.get(i).getRodas() == 4){
                Carro carro = (Carro) gridDaCorrida.get(i);
                System.out.println(carro.getPlaca());
            }else if (gridDaCorrida.get(i).getPeso() == 300 && gridDaCorrida.get(i).getRodas() == 2){
                Moto moto = (Moto) gridDaCorrida.get(i);
                System.out.println(moto.getPlaca());
            }
        }
    }

    public void socorrerCarro(String placa){
//        for (int i=0; i < gridDaCorrida.size();i++){
//
//            Carro carro = (Carro) gridDaCorrida.get(i);
//
//            if ((gridDaCorrida.get(i).getPeso() == 1000 && gridDaCorrida.get(i).getRodas() == 4) && carro.getPlaca().equals(placa)){
//                socorristaCarro.socorrerCarro(carro);
//
//            }else {
//                System.out.printf("Placa não encontrada na corrida.");
//            }
//        }
        for(Veiculo veiculo: gridDaCorrida){
            if(veiculo.getPlaca().equals(placa)&&(veiculo instanceof Carro)){
                socorristaCarro.socorrerCarro((Carro) veiculo);
                return;
            }
        }
        System.out.println("NENHUM CARRO COM ESTA PLACA NA CORRIDA!!!!");
    }




    public void socorrerMoto(String placa){
//        for (int i=0; i < gridDaCorrida.size();i++){
//
//            Moto moto = (Moto) gridDaCorrida.get(i);
//
//            if ((gridDaCorrida.get(i).getPeso() == 300 && gridDaCorrida.get(i).getRodas() == 2) && moto.getPlaca().equals(placa)){
//                socorristaMoto.socorrerMoto(moto);
//
//            }else{
//                System.out.printf("Placa não encotrada na corrida.");
//            }
//        }
        for(Veiculo veiculo: gridDaCorrida){
            if(veiculo.getPlaca().equals(placa)&&(veiculo instanceof Moto)){
                socorristaMoto.socorrerMoto((Moto) veiculo);
                return;
            }
        }
        System.out.println("NENHUM CARRO COM ESTA PLACA NA CORRIDA!!!!");
    }

}
