package org.fundamentals.composition;

import lombok.Data;

@Data
public class Motor {
    private String tipo;
    private int cilindradas;

    public Motor(String tipo, int cilindradas) {
        this.tipo = tipo;
        this.cilindradas = cilindradas;
    }

    public void ligar() {
        System.out.println("Motor " + tipo + " de " + cilindradas + " cc ligado.");
    }

    public void desligar() {
        System.out.println("Motor desligado.");
    }

}
