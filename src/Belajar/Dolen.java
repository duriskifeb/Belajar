package semester1.Belajar;

import java.util.Scanner;

public class Dolen {
    public static void main(String[] args) {
        // membuat sebuah objek untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);
        
        // sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 5;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("MASUKKAN NILAI TEBAKAN ANDA : ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("nilai tebakan anda adalah : " + nilaiTebakan);

        // operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);

        // operasi aljabar boolean (and / or)

        System.out.print("MASUKKAN NILAI ANTARA 1 - 10 : ");
        nilaiTebakan = inputUser.nextInt();

        statusTebakan = (nilaiTebakan > 1) && (nilaiTebakan < 10);

        System.out.println(" tebakan anda : " + statusTebakan);
        
    }
}

