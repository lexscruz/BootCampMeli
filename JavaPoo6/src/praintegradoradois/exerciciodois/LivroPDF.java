package praintegradoradois.exerciciodois;

public class LivroPDF extends Imprimir{
    private Integer numPaginas;
    private String nomeAutor;
    private String titulo;
    private String genero;

    public LivroPDF(Integer numPaginas, String nomeAutor, String titulo, String genero) {
        this.numPaginas = numPaginas;
        this.nomeAutor = nomeAutor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public void imprimir() {
        imprimir(this);
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }




}
