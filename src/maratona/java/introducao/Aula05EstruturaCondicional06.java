package maratona.java.introducao;

public class Aula05EstruturaCondicional06 {
    public static void main(String[] args) {
        //dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        //considerando 1 como domingo
        byte dia = 8;
        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
