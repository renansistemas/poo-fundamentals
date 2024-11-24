package org.fundamentals;

public class SistemaFinanceiro {

    public static void main(String[] args) {
        RelatorioFinanceiro relatorio = new RelatorioFinanceiro();

        // OK: dentro do mesmo pacote.
        System.out.println("Lucro mensal: " + relatorio.calcularLucroMensal());
    }

}
