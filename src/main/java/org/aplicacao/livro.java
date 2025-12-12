package org.aplicacao;
@SuppressWarnings("all")
public class livro implements publicacao {
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

    public livro(String titulo, pessoa leitor, int totpag, String autor) {
        this.titulo = titulo;
        this.leitor = String.valueOf(leitor);
        this.aberto = false;
        this.pagAtual = 0;
        this.totpag = totpag;
        this.autor = autor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
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

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
