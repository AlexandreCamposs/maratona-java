package maratona.java.javacore.Aintroducaoclasses.test;

import maratona.java.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Paulo";
        professor.idade = 26;
        professor.matricula = 4526;

        System.out.println(professor.nome + " " + professor.idade + " " + professor.matricula);
    }
}
