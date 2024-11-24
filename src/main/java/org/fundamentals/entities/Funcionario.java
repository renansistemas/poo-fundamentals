package org.fundamentals.entities;

public class Funcionario {

    protected String nome;
    protected int desempenho;
    private double salario; // Atributo sensível.

    public Funcionario(double salarioInicial) {
        this.salario = salarioInicial;
    }

    public Funcionario(String nome, int desempenho) {
        this.nome = nome;
        this.desempenho = desempenho;
    }

    //metodo para mostrar o desempenho do funcionario
    protected void mostrarDesempenho() {
        System.out.println("Funcioonário: " + nome + ", Desempenho: " + desempenho);
    }

    // Método público para acessar o salário de forma controlada.
    public double getSalario() {
        return salario;
    }

    // Método público para alterar o salário, com validação.
    public void ajustarSalario(double porcentagem) {
        if (porcentagem > 0) {
            salario += salario * (porcentagem / 100);
        } else {
            System.out.println("Ajuste inválido.");
        }
    }

}
