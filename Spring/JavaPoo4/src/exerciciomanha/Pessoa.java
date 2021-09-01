package exerciciomanha;

public class Pessoa {

    private String id;
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(){
    }
    public Pessoa(String id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(String id, String nome, int idade, double peso, double altura) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setCpf(int idade) {
        this.idade = idade;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC(){
        double imc;
        imc = this.peso /Math.pow(this.altura, 2);
        if (imc < 20){
            return -1;
        }else if (imc >= 20 && imc <= 25){
            return 0;
        }else{
            return 1;
        }
    }

    public boolean ehMaiorDeIdade(){
        boolean ehMarioDeIdade = false;
        if (idade >= 18){
            ehMarioDeIdade = true;
        }
        return ehMarioDeIdade;
    }
    @Override
    public String toString(){
        return  "Nome: "+ nome +" - Idade: " + idade + " - Peso: " + peso + " - Altura: " + altura;
    }
}

