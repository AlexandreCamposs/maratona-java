package maratona.java.introducao;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        //while,do while, for
        int count = 0;
        while (count < 10) {
            count++;
            System.out.println(count);
        }

        int y = 0;
        do {
            System.out.println("Valor do do while é: " + y++);
        } while (y <= 15);


        for (int x = 0; x <= 10; x++) {
            System.out.println(x);
        }
    }
}
