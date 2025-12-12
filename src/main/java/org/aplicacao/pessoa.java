package org.aplicacao;
@SuppressWarnings("all")
public class pessoa {
    private String nome;
    private int idade;
    private String sexo;


    public void fazerNiver(){
        this.idade++;
    }

    public pessoa(int idade, String nome, String sexo) {
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
    }
}
