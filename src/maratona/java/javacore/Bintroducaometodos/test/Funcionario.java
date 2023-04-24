package maratona.java.javacore.Bintroducaometodos.test;

import maratona.java.javacore.Bintroducaometodos.dominio.Funcionarios;

public class Funcionario {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();

        funcionario.nome = "Alex";
        funcionario.idade = 26;
        funcionario.salarios = new double[]{1100,950.56,2500};
        funcionario.imprimeDados();

    }
}
