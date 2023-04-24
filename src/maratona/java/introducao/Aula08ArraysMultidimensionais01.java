package maratona.java.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //arrays lincados
        String[][] nomes = new String[2][2];
        nomes[0][0] = "alexandre";
        nomes[0][1] = "Alex";

        nomes[1][0] = "Caio";
        nomes[1][1] = "Fabio";

        for (int i = 0; i < nomes.length; i++) {
            //System.out.println(nomes[i][0]);
            for (int y = 0; y < nomes[i].length; y++) {
                System.out.println(nomes[i][y]);
            }
        }
        System.out.println("-------------");

        for(String[] arrBase: nomes){
            for(String y: arrBase){
                System.out.println(y);
            }
        }
    }
}
