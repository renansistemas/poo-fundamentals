package org.fundamentals.agregation;

import lombok.Data;

@Data
public class Motorista {

    private String nome;
    private String cnh;

    public Motorista(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
    }

    public void dirigir() {
        System.out.println("Motorista " + nome + " está dirigindo.");
    }
}
