package exerciciotarde;

class Participante{

    private double valorInscricao;
    private int idade;
    private String rg;
    private String nome;
    private String sobreNome;
    private String telefoneCelular;
    private String numeroEmergencia;
    private String gruposanguineo;

    public Participante(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Participante(int idade, String rg, String nome, String sobreNome, String telefoneCelular, String numeroEmergencia, String gruposanguineo) {
        this.idade = idade;
        this.rg = rg;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.telefoneCelular = telefoneCelular;
        this.numeroEmergencia = numeroEmergencia;
        this.gruposanguineo = gruposanguineo;
    }

    public double getValorInscricao() {
        return valorInscricao;
    }

    public void setValorInscricao(double valorInscricao) {
        this.valorInscricao = valorInscricao;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public void setNumeroEmergencia(String numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public String getGruposanguineo() {
        return gruposanguineo;
    }

    public void setGruposanguineo(String gruposanguineo) {
        this.gruposanguineo = gruposanguineo;
    }

    @Override
    public String toString(){

        return " Participante: RG: " + rg + ", Nome: " + nome + ", Sobrenome: " +sobreNome
                + ", Idade: " + idade + ", Celular: " + telefoneCelular
                + ", Telefone de emergência" + numeroEmergencia
                + ", Grupo sanguíneo" + gruposanguineo;
    }
}