package semester1.Belajar;

import java.util.Scanner;

public class WeloWelo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilaiPertama, nilaiTerkhir, Total;
        
        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukkan nilai peretama : " );

        nilaiPertama = inputUser.nextInt();
        System.out.print("masukan nilai akhir : ");
        nilaiTerkhir = inputUser.nextInt();

        Total = 0;


        // System.out.println("awalan program..");

        while (nilaiPertama <= nilaiTerkhir) {
           Total = Total + nilaiPertama;
           System.out.println("ditambah " + nilaiPertama + " menjadi " + Total);
           nilaiPertama++;
           
        }
    }
}
