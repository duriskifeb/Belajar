package semester1.Belajar;

import java.util.Scanner;

public class kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("|===========================================|");
        System.out.println("|         PROGRAM KASIR SEDERHHANA          |");
        System.out.println("|===========================================|");
        System.out.println("|             PILIH MENU minuman            |");
        System.out.println("|===========================================|");
        System.out.println("| 1. Nasi Goreng jawa            Rp 13.000  |");
        System.out.println("| 2. Nasi uduk jogja             Rp 11.000  |");
        System.out.println("| 3. Nasi rujak cingur           Rp 15.000  |");
        System.out.println("| 4. Nasi Lodeh maksreng         Rp 13.000  |");
        System.out.println("| 5. Nasi rawom makbyur          Rp 16.000  |");
        System.out.println("|===========================================|");

        System.out.print("Pilih minuman anda : |1|2|3|4|5|");
        int makanan = input.nextInt();

        System.out.print("Berapa porsi : ");
        int jumlah_porsi = input.nextInt();

        int total_makanan = 0;
        String nama_makanan = null;

        switch (makanan) {
            case 1:
                total_makanan = jumlah_porsi * 13000;
                nama_makanan = "Nasi Goreng jawa";
                System.out.println("Nasi Goreng jawa" + jumlah_porsi + " porsi : Rp" + total_makanan);
                break;

            case 2:
                total_makanan = jumlah_porsi * 11000;
                nama_makanan = "Nasi uduk jogja";
                System.out.println("Nasi uduk jogja" + jumlah_porsi + " porsi : Rp" + total_makanan);
                break;

            case 3:
                total_makanan = jumlah_porsi * 15000;
                nama_makanan = "Nasi rujak cingur";
                System.out.println("Nasi rujak cingur" + jumlah_porsi + " porsi : Rp" + total_makanan);
                break;

            case 4:
                total_makanan = jumlah_porsi * 13000;
                nama_makanan = "Nasi Lodeh maksreng";
                System.out.println("Nasi Lodeh maksreng" + jumlah_porsi + " porsi : Rp" + total_makanan);
                break;

            case 5:
                total_makanan = jumlah_porsi * 16000;
                nama_makanan = "Nasi rawom makbyur";
                System.out.println("Nasi rawom makbyur" + jumlah_porsi + "porsi : Rp" + total_makanan);
                break;

            default:
                System.out.println("Mohon maaf, pilhan anda tidak ada");
                break;
        }

        System.out.println("|===========================================|");
        System.out.println("|          PROGRAM KASIR SEDERHANA          |");
        System.out.println("|===========================================|");
        System.out.println("|             PILIH MENU MINUMAN            |");
        System.out.println("|===========================================|");
        System.out.println("| 1. Es boba                     Rp 10.000  |");
        System.out.println("| 2. Es cendol dawet             Rp 10.000  |");
        System.out.println("| 3. Es capucino                 Rp 5.000  |");
        System.out.println("| 4. Es teh wico                 Rp 5.000   |");
        System.out.println("| 5. Es serut durian             Rp 7.000   |");
        System.out.println("|===========================================|");

        System.out.print("Pilih minuman anda : |1|2|3|4|5|");
        int minuman = input.nextInt();

        System.out.print("Berapa gelas : ");
        int jumlah_gelas = input.nextInt();

        int total_minuman = 0;
        String nama_minuman = null;

        switch (minuman) {
            case 1:
                total_minuman = jumlah_porsi * 13000;
                nama_minuman = "Nasi Goreng jawa";
                System.out.println("Nasi Goreng jawa" + jumlah_porsi + " porsi : Rp" + total_minuman);
                break;

            case 2:
                total_minuman = jumlah_porsi * 11000;
                nama_minuman = "Nasi uduk jogja";
                System.out.println("Nasi uduk jogja" + jumlah_porsi + " porsi : Rp" + total_minuman);
                break;

            case 3:
                total_minuman = jumlah_porsi * 15000;
                nama_minuman = "Nasi rujak cingur";
                System.out.println("Nasi rujak cingur" + jumlah_porsi + " porsi : Rp" + total_minuman);
                break;

            case 4:
                total_minuman = jumlah_porsi * 13000;
                nama_minuman = "Nasi Lodeh maksreng";
                System.out.println("Nasi Lodeh maksreng" + jumlah_porsi + " porsi : Rp" + total_minuman);
                break;

            case 5:
                total_minuman = jumlah_porsi * 16000;
                nama_minuman = "Nasi rawom makbyur";
                System.out.println("Nasi rawom makbyur" + jumlah_porsi + "porsi : Rp" + total_minuman);
                break;

            default:
                System.out.println("Mohon maaf, pilhan anda tidak ada");
                break;
        }

        int jumlah_semua;
        jumlah_semua = total_makanan + total_minuman;

        System.out.println("|=========================================|");
        System.out.println("|             DAFTAR PEMBELIAN            |");
        System.out.println("|=========================================|");
        System.out.println("| MAKANAN         : " + nama_makanan  + "\t  |");
        System.out.println("| Jumlah porsi    : " + jumlah_porsi + "\t                  |");
        System.out.println("| minuman         : " + nama_minuman + "\t  |");
        System.out.println("| Jumlah Gelas    : " + jumlah_gelas + "\t                  |");
        System.out.println("|=========================================|");
        System.out.println("| TOTAL HARGA     : " + jumlah_semua);
        System.out.println("|=========================================|");



    }
}
