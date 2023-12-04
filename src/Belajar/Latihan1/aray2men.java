package Belajar.Latihan1;

public class aray2men {
    public static void main(String[] args) {
        
        // ini yang untuk array dua dimensi
        int[][] apa = {
            {1,2,3,8,9},
            {4,5,},
            {7,8,9,6},
        };

        System.out.println("panjangnya ke 1 : " + apa[0].length);
        System.out.println("panjangnya ke 2 : " + apa[0].length);
        System.out.println("panjangnya ke 3 : " + apa[0].length);
        System.out.println("\n");

        // ini untuk mengeprint semua element array yang telah tertulis
        int[][] yapa = {

            {1,-2,3},
            {4,-6,4,5},
            {2},
        };

        for ( int i = 0; i < yapa.length; i++) {
            for (int j = 0; j < yapa.length; j++) {
                System.out.println(yapa[i][j]);
            }
        }
    }
}
