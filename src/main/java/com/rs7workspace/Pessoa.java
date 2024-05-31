package com.rs7workspace;

import java.time.LocalDate;

public class Pessoa {

    private String nome;

    private int idade;

    private LocalDate data = LocalDate.now();


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
        return getIdade() >= 18;
    }

    public int calculaAnoNascimeto(){
        return data.getYear() - getIdade();
    }

}
