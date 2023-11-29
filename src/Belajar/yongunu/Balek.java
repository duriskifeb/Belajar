package Belajar.yongunu;

import java.util.Scanner;


public class Balek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = 5, raww = 0;

        // System.out.println("---o0 H! 0o---");
        // System.out.print("masukkan angka yang anda minta : ");
        // int r = input.nextInt();

        System.out.println();
        
        for (int i = 1; i <= rows; i++, raww = 0){
            for(int space = 1; space <= rows -1; space++){
                System.out.println(" ");
            }
            while (raww != 2 * i -1) {
                System.out.print("* ");
                raww++;
            } 
             System.out.println();  
             
            
        }
        input.close();

        
    }
}