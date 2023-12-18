package Belajar.Latihan1;

public class Fungction2 {
    public static void main(String[] args) {
        int panjang = 10;
        int lebar = 5;
        int hasisl = hitungLuas(panjang, lebar); //memanggil fungsi
        System.out.println("Hasilnya adalah = " + hasisl);
    }

    public static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }
}
