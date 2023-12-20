package Project1.TugasBesar;

import java.util.Scanner;

public class Database {
    public static void showMenu() {
        Main.displayAdminMenu();
        Scanner putin = new Scanner(System.in);
        boolean pilihan = true;
        
        while (pilihan) {
            System.out.println("Pilih Jenis Tiket Konser : ");
            System.out.println("1. Tiket Reguler");
            System.out.println("1. Tiket VIP");
            System.out.println("0. Tiket VVIP");
        
            System.out.print("Masukkan pilihan anda [1 - 2]");
            int milih = putin.nextInt();
        
            switch (milih) {
                case 1:
                    System.out.println("Andah memilih tiket reguler");
                    break;
                case 2:
                    System.out.println("Andah memilih tiket reguler");
                    break;
                case 0:
                    System.out.println("Andah memilih tiket reguler");
                    break;
        
                default:
                    break;
            }
            
        }
    }
}
