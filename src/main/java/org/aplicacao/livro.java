package org.aplicacao;
@SuppressWarnings("all")
public class livro {
    private String titulo;
    private String autor;
    private int totpag;
    private int pagAtual;
    private boolean aberto;
    private String leitor;


    public String detalhes() {
        return "livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totpag=" + totpag +
                ", pagAtual=" + pagAtual +
                ", aberto=" + aberto +
                ", leitor='" + leitor + '\'' +
                '}';
    }
    public livro(String titulo, String leitor, int totpag, String autor) {
        this.titulo = titulo;
        this.leitor = leitor;
        this.totpag = totpag;
        this.autor = autor;
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotpag() {
        return totpag;
    }

    public void setTotpag(int totpag) {
        this.totpag = totpag;
    }

}
