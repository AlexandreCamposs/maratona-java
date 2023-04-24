package maratona.java.introducao;

public class Aula06EstruturaDeRepeticao05 {
    public static void main(String[] args) {

        double valorTotal = 40000;
        for (int parcela = (int) valorTotal; valorTotal >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " Valor " + valorParcela);
        }
    }
}
