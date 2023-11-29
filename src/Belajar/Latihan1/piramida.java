package Belajar.Latihan1;

import java.util.Scanner;

public class piramida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----o0 HI 0o----");
        System.out.println("APLIKASI PIRAMIDA JAVA");
        System.out.println("----o0 HI 0o----");
        System.out.println();

        int tinggiSegitiga,i,j,k;

        System.out.print("Input tinggi segitiga : ");
        tinggiSegitiga = input.nextInt();

        System.out.println();

        for (i=1; i<=tinggiSegitiga; i++){
            for(j=1; j <= tinggiSegitiga-i; j++){
                System.out.print(" ");
            }

            for(k = 1; k <=i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

        for (i=0; i<=tinggiSegitiga; i++){
            for(j=1; j <= i; j++){
                System.out.print(" ");
            }

            for(k = 1; k <=tinggiSegitiga; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        
    }
}
