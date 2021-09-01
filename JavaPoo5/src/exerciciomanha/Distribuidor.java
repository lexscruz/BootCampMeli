package exerciciomanha;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class Distribuidor {

    public static void main(String[] args) {


        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Pereciveis("danup",12,1));
        produtos.add(new Pereciveis("iogurte",12,1));
        produtos.add(new Pereciveis("danup",12,1));

        produtos.add(new NaoPereciveis("biscoito",4.50,"consumivel"));
        produtos.add(new NaoPereciveis("biscoito",4.50,"consumivel"));
        produtos.add(new NaoPereciveis("biscoito",4.50,"consumivel"));

        double ttlPer = 0.0;
        double ttlNPer = 0.0;

        for (Produto p :
                produtos) {
            if (p instanceof Pereciveis){
                ttlPer += p.getPrice();
                System.out.println(p.toString());
                System.out.println(p.calcularProduto(1));
            }
            else{
                ttlNPer += p.getPrice();
                System.out.println(p.toString());
                System.out.println(p.calcularProduto(1));

            }
        }
    }
}
