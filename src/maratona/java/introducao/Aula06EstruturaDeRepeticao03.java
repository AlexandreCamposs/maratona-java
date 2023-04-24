package maratona.java.introducao;

public class Aula06EstruturaDeRepeticao03 {
    public static void main(String[] args) {
        //Imprima os primeiros 25 números de um dado valor. Por exemplo 25;
        int valorMaximo = 50;
        for (int i = 0; i <= valorMaximo; i++) {
            if (i > 25) {
                break;
            }
            System.out.println("Valor de i: " + i);
        }
    }
}
