package maratona.java.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // + - / *
        int numero1 = 10;
        int numeor2 = 20;
        double somaDosValores = numeor2 / (double) numero1;
        //System.out.println(numero1 + numeor2 +"valor"+numero1 + numeor2);
        //System.out.println(somaDosValores);

        //%

        int resto = 10 % 2;
        //System.out.println(resto);

        // <  >  >=  <=
        boolean isDezMaiorQueVinte = 10 >= 20;
        boolean isDezMenorQueVinte = 10 <= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 20;

        //System.out.println(isDezMaiorQueVinte);
        //System.out.println(isDezMenorQueVinte);
        //System.out.println(isDezIgualVinte);
        //System.out.println(isDezIgualDez);

        // && (AND)  || (OR)  !
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        //System.out.println(isDentroDaLeiMaiorQueTrinta);
        //System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorContaCorrente = 500;
        double valorContaPoupanca = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystationCompravel = valorContaCorrente > valorPlaystation || valorContaPoupanca > valorPlaystation;

        //System.out.println(isPlaystationCompravel);

        // = +=  -=  /=  %=
        double bonus = 1000;
        bonus += 500;
        //bonus -= 200;
        //bonus *= 100;
        //bonus %= 2;
       // System.out.println(bonus);

        int contador = 0;
        contador += 1;
        contador ++;
        ++contador;
        --contador;
        System.out.println(contador);
    }
}
