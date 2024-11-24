package org.fundamentals.entities;

public class Gerente extends Funcionario {

    public Gerente(String nome, int desempenho) {
        super(nome, desempenho);
    }

    public void avaliarEquipe() {
        mostrarDesempenho();
        System.out.println("Gerente avaliando equipe.");
    }

}
