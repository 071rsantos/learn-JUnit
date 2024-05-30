package com.rs7workspace;

public class Pessoa {

    private String nome;

    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public int getIdade() {
        return idade;
    }

    public String getNome(){
        return nome;
    }

    public boolean ehMaior(){
        return getIdade() > 18;
    }

}
