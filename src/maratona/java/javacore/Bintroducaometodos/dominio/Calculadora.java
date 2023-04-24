package maratona.java.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisValores() {
        System.out.println(10 + 10);
    }

    public void divideDoisValores() {
        System.out.println(10 / 5);
    }

    public void multiplicaDoisValores(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisValores2(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisValores3(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }
    public void imprimidivideDoisnumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisao por 0");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisValores(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisValores ");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
