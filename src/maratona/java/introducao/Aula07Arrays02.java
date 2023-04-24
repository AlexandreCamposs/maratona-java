package maratona.java.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte,short,int,long,float e double 0
        // char '\u0000'  '  '
        //boolean false
        //String null

        char [] idade = new char[3];
        boolean [] idade2 = new boolean[3];
        String [] idade3 = new String[3];
        int [] idade4 = new int[3];
        System.out.println(idade[0]);
        System.out.println(idade2[1]);
        System.out.println(idade3[2]);
        System.out.println(idade4[2]);

        //-----------------------------
        String [] nomes = new String[3];
        nomes[0] = "Carlos";
        nomes[1] = "Pedro";
        nomes[2] = "Marcos";

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
