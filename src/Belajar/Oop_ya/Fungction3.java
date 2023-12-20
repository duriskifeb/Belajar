package Belajar.Oop_ya;

public class Fungction3 {
    public static void main(String[] args) {
        double p = 10;
        double l = 20;
        double hasil = hitungLuas(p, l);
        System.out.println("Hasilnya adalah = " + hasil);

        int pn = 20;
        int lb = 20;
        int hsl = hitungLuas(pn, lb);
        System.out.println("Hassilnya adalah = " + hsl);
    }

    public static double hitungLuas (double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }

    public static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }
}
