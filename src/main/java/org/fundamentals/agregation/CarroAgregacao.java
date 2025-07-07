package org.fundamentals.agregation;

import lombok.Data;

@Data
public class CarroAgregacao {

    private String marca;
    private String modelo;
    private Motorista motorista;

    public CarroAgregacao(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        // Motorista não é criado automaticamente
    }

    // Motorista é associado ao carro (agregação)
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
        System.out.println("Motorista " + motorista.getNome() +
                " agora dirige o " + marca + " " + modelo);
    }

    public void removerMotorista() {
        if (motorista != null) {
            System.out.println("Motorista " + motorista.getNome() +
                    " saiu do " + marca + " " + modelo);
            motorista = null;
        }
    }

    public void dirigir() {
        if (motorista != null) {
            System.out.println("Dirigindo o " + marca + " " + modelo);
            motorista.dirigir();
        } else {
            System.out.println("Não há motorista para dirigir o carro.");
        }
    }

}
