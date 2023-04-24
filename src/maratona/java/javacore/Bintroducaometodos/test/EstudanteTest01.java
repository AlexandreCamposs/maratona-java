package maratona.java.javacore.Bintroducaometodos.test;

import maratona.java.javacore.Bintroducaometodos.dominio.Estudante;
import maratona.java.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora =  new ImpressoraEstudante();



        estudante1.nome = "Alexandre";
        estudante1.idade = 30;
        estudante1.sexo = 'M';

        estudante2.nome = "Pedro";
        estudante2.idade = 20;
        estudante2.sexo = 'M';

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

        System.out.println("######");

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

        //System.out.println(estudante1.nome + " " + estudante1.idade + " anos, sexo " + estudante1.sexo);
        //System.out.println(estudante2.nome + " " + estudante2.idade + " anos, sexo " + estudante2.sexo);
    }
}
