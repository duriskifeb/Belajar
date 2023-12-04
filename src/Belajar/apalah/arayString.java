package Belajar.apalah;

import java.util.Arrays;

public class arayString {
    public static void main(String[] args) {
        
        // membuat String
        String kataString = "hallo";

        char[] kataChar = {'H','A','L','L','O'};

        // menampilkan String
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));

        // mengakses komponen dari String
        System.out.println("komponen utama dari char adalah = " + kataChar[3]);
        System.out.println("komponen utama dari char adalah = " + kataString.charAt(4));
        System.out.print("\n");

        // merubah komponen
        kataChar[0] = 'C';
        System.out.println(Arrays.toString(kataChar));

        // merubah array di string secara tidak langsung
        // menggunakan substring

        printAdress("kataString", kataString);

        kataString = "H" + kataString.substring(1, 5);

        System.out.println(kataString);

        printAdress("kata String", kataString);
        System.out.println();

        //  ini adalah memori dari string
        String str1 = "Hallo kak";
        String str2 = "Apa kabar";
        String str3 = "Baik-baik";

        printAdress("str1", str1);
        printAdress("str2", str2);
        printAdress(str3, "str3");

        String str4 =  "Sehat saja";
        printAdress("str4", str4);

        kataString = "ojok lelah";
        printAdress("kataString", kataString);

        // sedikit catatan" 
        // 1. String di java itu imutable 
        // 2. String yang berada di String pool itu akan reusable, memorinya lebih efissien
        // 3. membuat String dengan methode baru, maka dia di taruh di methode yang lain, bukan di string pool


        // lihat lebih dalam
        String a = new String("hallo");
        printAdress("a", a);

    }

    private static void printAdress(String nama, String data) {
        int adress = System.identityHashCode(data);
        System.out.println(nama + " = " + data + "\t|| adress = " + Integer.toHexString(adress));
    }
}
