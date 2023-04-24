package maratona.java.introducao;

public class Aula06EstruturaDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima números pares até 1000000
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println("Número par: " + i);
            }
        }
    }
}
