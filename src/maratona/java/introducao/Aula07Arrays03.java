package maratona.java.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] idade = new int[5];
        int[] idade2 = {1,2,3};
        String [] nomes = new String[]{"Caio","Pedro","Alex",};
        String [] nomes2 = new String[]{"Goku","Naruto","Bulma",};

        System.out.println(idade);
        System.out.println(idade2);
        System.out.println(nomes);

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        //ForEach
        for(String i :nomes2){
            System.out.println(i);
        }

    }
}
