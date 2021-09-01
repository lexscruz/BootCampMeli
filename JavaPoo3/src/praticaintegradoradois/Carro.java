package praticaintegradoradois;

public class Carro extends Veiculo{

    private static final double PESO_CARRO = 1000.0;
    private static final int QUANTIDADE_RODAS = 4;

    public Carro(String placa, double velocidade, double aceleracao, double anguloDeVirada) {
        super(placa, velocidade, aceleracao, anguloDeVirada,PESO_CARRO,QUANTIDADE_RODAS);

    }

    @Override
    public String toString(){
        return  super.toString();
    }
}
