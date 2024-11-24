package org.fundamentals.entities;

public class ContaBancaria {

    private double saldo; // O saldo está protegido (não acessível diretamente).

    // Método para verificar o saldo (somente leitura).
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar dinheiro (regra controlada).
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    // Método para sacar dinheiro (regra controlada).
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

}
