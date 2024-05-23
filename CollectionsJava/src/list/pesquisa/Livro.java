package list.pesquisa;

public class Livro {
    
    private String titulo; 
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
       
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String toString() {
        return  "Titulo do livro: " + titulo + ", autor: " + autor + ", ano de publicacao: " + anoPublicacao;
    }
























}
