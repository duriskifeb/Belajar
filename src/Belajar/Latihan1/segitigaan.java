package Belajar.Latihan1;

import java.util.Scanner;

public class segitigaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-----o0 HI Rek 0o----");
        System.out.println("APLIKASI SEGITIGA JAVA");
        System.out.println("-----o0 HI Rek 0o----");
        System.out.println();

        int tinggiSegitiga,i,j;

        System.out.print("input tingi segitiga : ");
        tinggiSegitiga = input.nextInt();
        System.out.println();

        for (i=0; i <= tinggiSegitiga; i++){
            for (j=1; j <= tinggiSegitiga-i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

          for (i=0; i <= tinggiSegitiga; i++){
            for (j=1; j <= i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
