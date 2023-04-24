package maratona.java.introducao;

public class Aula06EstruturaDeRepeticao04 {
    //Dado o valor do carro, descubra quantas vezes ele pode ser parcelado.
    //Valor da parcela deve ser >= 1000
    public static void main(String[] args) {

        double valorCarro = 40000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " Valor " + valorParcela);
        }
    }
}
