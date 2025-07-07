package org.fundamentals.composition;

public class Main {
    public static void main(String[] args) {

        CarroComposicao carroComposicao = new CarroComposicao("Chevrolet", "Ônix", "Gasolina", 2000);
        carroComposicao.ligar();
        carroComposicao.desligar();
        carroComposicao.destruir();

    }
}