package Belajar.Latihan1;

import java.util.Scanner;

public class bangunan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----o0 HI guys 0o----");
        System.out.println("APLIKASI PERSEGI JAVA ");
        System.out.println("----o0 HI guys 0o----");
        System.out.println();

        int tinggiPersegi,lebarPersegi,i,j;

        System.out.print("input tinggi persegi mu : ");
        tinggiPersegi = input.nextInt();
        
        System.out.print("input lebar persegi mu : ");
        lebarPersegi = input.nextInt();
        System.out.println();

        for (i=1; i <= tinggiPersegi; i++) {
            for (j=1; j <= lebarPersegi; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
