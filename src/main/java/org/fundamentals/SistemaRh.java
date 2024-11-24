package org.fundamentals;

import org.fundamentals.entities.Funcionario;
import org.fundamentals.entities.Gerente;

public class SistemaRh {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(5000.00);

        // Acesso controlado pelo getter.
        System.out.println("Salário atual: " + funcionario.getSalario());

        // Atualização controlada pelo setter.
        funcionario.ajustarSalario(10); // Aumenta 10%.
        System.out.println("Novo salário: " + funcionario.getSalario());

        // Não é possível acessar diretamente:
        // funcionario.salario; // ERRO: 'salario' é privado.

        Gerente gerente = new Gerente("Maria Oliveira", 10);
        gerente.avaliarEquipe();

        // Não é possível acessar fora da hierarquia:
        // gerente.desempenho; // ERRO: 'desempenho' é protegido.

    }

}
