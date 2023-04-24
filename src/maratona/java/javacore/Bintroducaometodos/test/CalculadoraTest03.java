package maratona.java.javacore.Bintroducaometodos.test;

import maratona.java.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double dividir = calculadora.divideDoisValores2(5,2);
        System.out.println(calculadora.divideDoisValores2(5,2));
        System.out.println(dividir);
        System.out.println("---------");

        calculadora.imprimidivideDoisnumeros(100,0);


    }
}
