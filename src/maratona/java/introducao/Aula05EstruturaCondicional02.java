package maratona.java.introducao;

public class Aula05EstruturaCondicional02 {
    public static void main(String[] args) {
        // < 15 categoria infantil
        // >= 15 e < 18 juvenil
        // > 18 adulto
        int idade = 18;
        if(idade < 15){
            System.out.println("Categoria infantil");
        }else if(idade >= 15 && idade < 18){
            System.out.println("Categoria juvenil");
        }else{
            System.out.println("Categoria adulta");
        }
    }
}
