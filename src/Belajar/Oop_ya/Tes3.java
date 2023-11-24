package Belajar.Oop_ya;

import java.util.Arrays;

public class Tes3 {
    public static void main(String[] args) {

        int[] arrayAngka1 = { 1, 2, 3, 4, 5 };
        int[] arrayAngka2 = new int[5];

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        arrayAngka2 = arrayAngka1;

        System.out.println("ini adalah array ke 1 : " + Arrays.toString(arrayAngka1));
        System.out.println("ini adalah array ke 2 : " + Arrays.toString(arrayAngka2));
        System.out.println();

        arrayAngka1[1] = 200;
        arrayAngka2[4] = 300;
        System.out.println("ini adalah array ke 1 : " + Arrays.toString(arrayAngka1));
        System.out.println("ini adalah array ke 2 : " + Arrays.toString(arrayAngka2));
        System.out.println();

        ubahArray(arrayAngka1);
        System.out.println("ini adalah array ke 1 : " + Arrays.toString(arrayAngka1));
        System.out.println("ini adalah array ke 1 : " + Arrays.toString(arrayAngka2));

        // ---> ini menggunakan fooreach array <---

        // System.out.println("looping for each :");
        // for (int angka : arrayAngka){

        // System.out.println("angka pada looping ini adalah = " + angka);
        // }
    }

    // method yang argumenya adalah refrences, atau pass by refrence.
    public static void ubahArray (int[] dataArray){
        dataArray[0] = 290;
    }
}
