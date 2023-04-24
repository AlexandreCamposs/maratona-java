package maratona.java.introducao;

public class Aula05EstruturaCondicional04 {
    public static void main(String[] args) {
        //de R$ 1.903,99       - 7,5% - R$ 142,80
        //de R$ 2.826,66       - 15% - R$ 423,99
        //de R$ 3.751,06       - 22,5% - R$ 843,98
        //acima de R$ 4.664,68 - 27,5% - R$ 1282,78

        double salarioAnual = 4664.69;
        double primeiraFaixa = 7.5 / 100;
        double segundaFaixa = 15.0 / 100;
        double terceiraFaixa = 22.5 / 100;
        double quartaFaixa = 27.5 / 100;
        double valorImposto = 0;

        if(salarioAnual <=1903.98){
            System.out.println("Não precisa pagar imposto");
        }else if(salarioAnual >= 1903.99 && salarioAnual < 2826.66 ){
            valorImposto = salarioAnual * primeiraFaixa;
        }else if(salarioAnual >= 2826.66 && salarioAnual < 3751.06){
            valorImposto = salarioAnual * segundaFaixa;
        }else if(salarioAnual >= 3751.06 && salarioAnual <= 4664.68){
            valorImposto = salarioAnual * terceiraFaixa;
        }else{
            valorImposto = salarioAnual * quartaFaixa;
        }
        System.out.println(valorImposto);
    }
}
