package maratona.java.introducao;

public class Aula05EstruturaCondicional03 {
    public static void main(String[] args) {
        //doar se salario > 5000
        double salario = 5001;
        String resultado = salario > 5000 ?  "Eu vou doar pro devDojo" : "Eu vou não doar pro devDojo";
        System.out.println(resultado);
    }
}
