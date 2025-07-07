package org.fundamentals.agregation;

public class Main {
    public static void main(String[] args) {

        CarroAgregacao carroAgregacao = new CarroAgregacao("Chevrolet", "Ônix");
        Motorista motorista1 = new Motorista("Renan", "0067329999");
        Motorista motorista2 = new Motorista("Lucyana", "0026658822");

        carroAgregacao.dirigir(); // Nao tem motorista
        carroAgregacao.setMotorista(motorista1);
        carroAgregacao.dirigir();

        carroAgregacao.removerMotorista();
        carroAgregacao.setMotorista(motorista2);
        carroAgregacao.dirigir();

        motorista1.dirigir();

    }
}