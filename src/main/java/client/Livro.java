package client;

public class Livro {
    private String idLivro;
    private String titulo;
    private String autor;
    private Integer anoPublicacao;

    public Livro() {}

    public Livro(String idLivro, String titulo, String autor, Integer anoPublicacao) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getIdLivro() {
        return idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setIdLivro(String idLivro) {
        this.idLivro = idLivro;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
