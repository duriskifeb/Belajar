package Belajar.Latihan1;

import java.util.Arrays;

public class lanjutanArray2 {
    public static void main(String[] args) {
        
        int[][] array_2 = {
            {1,2,3},
            {4,5,6},

        };
        System.out.println(array_2);
        System.out.println(Arrays.toString(array_2));
        System.out.println(array_2[0]);
        System.out.println(array_2[1]);
        System.out.println();

        char[] array_char1 = {'a', 'b', 'c'};
        char[] array_char2 = {'d', 'e'};

        char[][] array_char2D = {
            array_char1,
            array_char2,
        };

        System.out.println(array_char2D);

    }
}
