package maratona.java.javacore.Bintroducaometodos.test;

import maratona.java.javacore.Bintroducaometodos.dominio.Estudante;
import maratona.java.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();



        estudante1.nome = "Alexandre";
        estudante1.idade = 30;
        estudante1.sexo = 'M';

        estudante2.nome = "Pedro";
        estudante2.idade = 20;
        estudante2.sexo = 'M';

        estudante1.imprime();
        estudante2.imprime();

    }
}
