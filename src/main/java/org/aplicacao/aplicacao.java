package org.aplicacao;
@SuppressWarnings("all")
public class aplicacao {
    public static void main(String[] args) {
        pessoa[]p = new pessoa[2];
        livro[]l = new livro[3];
        p[0] = new pessoa(17, "lais", "F");
        p[1] = new pessoa(17, "bruno", "M");

        l[0] = new livro("Verity", p[0], 320,"Collen Hoover");
        l[1] = new livro("Diario de Anne Frank", p[1], 244, "Anne Frank");
        l[2] = new livro("Os misterios do Universo", p[0], 200,"Jerffeson");

        System.out.println(l[0].detalhes());
    }
}
