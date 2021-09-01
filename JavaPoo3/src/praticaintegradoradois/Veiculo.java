package praticaintegradoradois;

public class Veiculo {

    protected String placa;
    protected double velocidade;
    protected double aceleracao;
    protected double anguloDeVirada;
    protected double peso;
    protected int rodas;

    public Veiculo(){
    }

    public Veiculo(String placa, double velocidade, double aceleracao, double anguloDeVirada, double peso, int rodas) {
        this.placa = placa;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeVirada = anguloDeVirada;
        this.peso = peso;
        this.rodas = rodas;
    }

    protected String getPlaca() {
        return placa;
    }

    protected void setPlaca(String placa) {
        this.placa = placa;
    }

    protected double getVelocidade() {
        return velocidade;
    }

    protected void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    protected double getAceleracao() {
        return aceleracao;
    }

    protected void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    protected double getAnguloDeVirada() {
        return anguloDeVirada;
    }

    protected void setAnguloDeVirada(double anguloDeVirada) {
        this.anguloDeVirada = anguloDeVirada;
    }

    protected double getPeso() {
        return peso;
    }

    protected void setPeso(double peso) {
        this.peso = peso;
    }

    protected int getRodas() {
        return rodas;
    }

    protected void setRodas(int rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString(){
        return  "Placa: " + placa + "\n Velocidade :  " + velocidade + "\n Aceleração: " + aceleracao +
                "\n Angulo de virada: " + anguloDeVirada + "\n Peso: " + peso +
                "\n Rodas: " + rodas;
    }
}
