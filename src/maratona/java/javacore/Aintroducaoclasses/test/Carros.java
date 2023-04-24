package maratona.java.javacore.Aintroducaoclasses.test;

import maratona.java.javacore.Aintroducaoclasses.dominio.Carro;

public class Carros {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ano = 2023;
        carro.nome = "gol";
        carro.modelo = "dg568e";

        System.out.println(carro.ano + " " + carro.modelo + " " + carro.nome);

        System.out.println("---");

        Carro carro2 = new Carro();
        carro2.nome = "Ferrari";
        carro2.ano = 2021;
        carro2.modelo = "DF669";

        System.out.println(carro2.ano + " " + carro2.modelo + " " + carro2.nome);

    }
}
