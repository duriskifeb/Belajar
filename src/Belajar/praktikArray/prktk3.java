package Belajar.praktikArray;

import java.util.ArrayList;
import java.util.Random;

public class prktk3 {

    Random getRandom = new Random();
    ArrayList<Integer> arList = new ArrayList<Integer>();

    public static void main(String[] args) {
        prktk3 list = new prktk3();

        System.out.println("input data :");
        list.isiNilai();
        
        System.out.println(" tampil array : ");
        list.tampilArray();

    }

    void isiNilai() {
        System.out.println("\n\nPengisian Nilai");
        int jml = 0;
        while (jml < 100) {
            System.out.print("No " + (jml + 1) + ". : ");
            int inputan = getRandom.nextInt(101);
            arList.add(inputan); // Penambahan data ke ArrayList
            jml++;
        }

    }

    void tampilArray() {
        System.out.println("\n\nDaftar Nilai");
        int a = 0;
        int arrMax = arList.size();
        while (a < arrMax) {
            // Mengambil nilai dari ArrayList pada index ke-a
            int nilai = arList.get(a);
            System.out.println("No" + (a + 1) + ". " + nilai);
            a++;
        }

    }

}
