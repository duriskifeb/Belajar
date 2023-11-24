package Belajar.Oop_ya;

import java.lang.reflect.Array;
import java.util.Arrays;

import Belajar.apalah.arayan;

public class Tes4 {
    public static void main(String[] args) {
        
        int[] arrayAngka1 = {1,2,3,4,5,};
        int[] arrayAngka2 = {1,2,3,4,5,};


        // ini mengubah data array ke string
        System.out.println("=========================");
        System.out.println("Merubah Array ke string");
        printArray(arrayAngka1);
        System.out.println("=========================");
        System.out.println();

        // ngopi denga loopp.
        System.out.println("=====================");
        System.out.println("mengkopi array : ");
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println("=====================");
        System.out.println();
        
        // ngopi dengan copyOF
        System.out.println("======================");
        System.out.println("ngopi dengan copyOF");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 5);
        printArray(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println("======================");
        System.out.println();


        // ngopi dengan copyOFRange
        System.out.println("========================");
        System.out.println(" ngopi dengan copyOFRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2, 5);
        printArray(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println("========================");
        System.out.println();

        System.out.println("========================");
        System.out.println("refiil aray : ");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5, 123);
        printArray(arrayAngka5);
        System.out.println("========================");
        System.out.println();

        System.out.println("============================");
        System.out.print("komparasi array : ");
        int[] arrayAngka6 = {1,2,3,4,5};
        int[] arrayAngka7 = {1,2,3,4,5};
        System.out.println();

        // membandingkan antara dua buah array
        System.out.println("==================================");
        System.out.println("membandingkan dua buah array : ");
        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));

        if (Arrays.equals(arrayAngka6,arrayAngka7)) {
            System.out.println("array ini sama");
        }else {
            System.out.println("array ini berbeda ");
        }
        System.out.println();

        // membandingkan array mana yang lebih besar
        System.out.println("============================");
        System.out.println("array yang besar adalah : ");
        System.out.println("============================");
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));
        System.out.println();

        // ngecek indeks dari array mana yang berbeda
        System.out.println("==============================");
        System.out.println("Mau ngecek array mana yang beda :");
        System.out.println("==============================");
        System.out.println(Arrays.mismatch(arrayAngka2, arrayAngka7));
        System.out.println();

        // operasi array dia sakit
        System.out.println("================================");
        System.out.println(" peng-operasian arrray : ");
        System.out.println("================================");
        int[] arrayAngka8 = {1,2,3,4,5,6};
        

    }

    public static void printArray (int[] dataArray){
        System.out.println("arrray nya adalah : " + Arrays.toString(dataArray));
    }
}
