package maratona.java.javacore.Bintroducaometodos.test;

import maratona.java.javacore.Bintroducaometodos.dominio.Calculadora;

public class CaculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisValores();
        System.out.println("Finalizando CalculadoraTest");

        calculadora.divideDoisValores();
        System.out.println("Finalizando divisão");
    }
}
