package org.fundamentals.composition;

import lombok.Data;

@Data
public class CarroComposicao {

    private String marca;
    private String modelo;
    private Motor motor; //composição - laço forte

    public CarroComposicao(String marca, String modelo, String tipoMotor, int cilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        // Motor é criado na construção do carro (composição)
        this.motor = new Motor(tipoMotor, cilindradas);
    }

    public void ligar() {
        System.out.println("Ligando carro " + marca + " " + modelo);
        motor.ligar();
    }

    public void desligar() {
        System.out.println("Desligando carro " + marca + " " + modelo);
        motor.desligar();
    }

    // Quando o carro é destruido, o motor também é (composição)
    public void destruir() {
        System.out.println("Carro sendo destruído junto com o seu motor");
        motor = null;
    }
}
