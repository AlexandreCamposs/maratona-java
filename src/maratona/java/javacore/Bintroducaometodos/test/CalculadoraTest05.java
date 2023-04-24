package maratona.java.javacore.Bintroducaometodos.test;

import maratona.java.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4};

        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,5,4);

    }
}
