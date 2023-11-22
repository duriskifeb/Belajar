package Belajar.Oop_ya;

import java.util.Scanner;

// public class Tes2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//     }
// }

class Laptop {
    int harga = 7500000;

    String cekHarga() {
        return "Harga Laptop adalah " + harga;
    }
};

class Tes2 {
    public static void main(String args[]) {

        Laptop laptopAnto = new Laptop();
        String hargaLaptopAnto = laptopAnto.cekHarga();
        System.out.println(hargaLaptopAnto);

    }
}