package praintegradoradois.exerciciodois;

import java.util.ArrayList;
import java.util.List;

public class Relatorio extends Imprimir{


    private Integer textoComprimento;
    private Integer numPaginas;
    private String autor;
    private String revisor;

    public Relatorio(Integer textoComprimento, Integer numPaginas, String autor, String revisor) {
        this.textoComprimento = textoComprimento;
        this.numPaginas = numPaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    public void imprimir() {
        imprimir(this);
    }

    public Integer getTextoComprimento() {
        return textoComprimento;
    }

    public void setTextoComprimento(Integer texteComprimento) {
        this.textoComprimento = texteComprimento;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }



}
