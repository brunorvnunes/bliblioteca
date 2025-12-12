package org.aplicacao;
@SuppressWarnings("all")
public class livro implements publicacao {
    private String titulo;
    private String autor;
    private int totpag;
    private int pagAtual;
    private boolean aberto;
    private pessoa leitor;


    public String detalhes() {
        return "\nlivro" + "\n Titulo = " + "'" + titulo + '\'' + "\n Autor = "
                + "'" + autor + '\'' + "\n Totpag = " + totpag +
                "\n PagAtual = " + pagAtual + "\n Aberto = " + aberto +
                "\n Leitor = " + leitor.getNome() + '\'' + "\n idade = " + leitor.getIdade() + "\n sexo = "+ leitor.getSexo()+'\n';

    }

    public livro(String titulo, pessoa leitor, int totpag, String autor) {
        this.titulo = titulo;
        this.setLeitor(leitor);
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

    public pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(pessoa leitor) {
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
