package maratona.java.introducao;

public class Aula05EstruturaCondicional05 {
    public static void main(String[] args) {
        //imprimir o dia da semana considerando 1 domingo

        byte dia = 8;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Erro insira número de 1 à 7");
                break;
        }

    }
}
