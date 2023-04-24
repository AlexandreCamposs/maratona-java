package maratona.java.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[4][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[]{1, 6, 5, 9, 8, 6};
        arrayInt[3] = new int[2];
        arrayInt[3][0] = 1;
        arrayInt[3][1] = 2;

        int[][] array2 = {{0, 1}, {1, 2, 3}, {1, 2, 5, 6}};

        for (int[] arrayBase2 : array2) {
            System.out.println("\n---");
            for (int num : arrayBase2) {
                System.out.println(num);
            }

            for (int[] arrayBase : arrayInt) {
                //System.out.println("\n---");
                for (int num : arrayBase) {
                   // System.out.println(num);
                }
            }
        }
    }
}
