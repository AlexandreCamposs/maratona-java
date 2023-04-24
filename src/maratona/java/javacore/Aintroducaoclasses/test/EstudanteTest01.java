package maratona.java.javacore.Aintroducaoclasses.test;

import maratona.java.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante.name = "Ale";
        estudante.idade = 30;
        estudante.sexo = "M";

        System.out.println(estudante.name);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("---------");
        System.out.println(estudante2.name);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);


    }
}
