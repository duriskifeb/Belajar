package Belajar.Latihan1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//  sedikit catatan 
// -----------------------

// kegunaan dan manfaat Hahset 
//   kegunaan : Digunakan untuk menyimpan kumpulan elemen unik tanpa adanya duplikasi.
//           : Kinerjanya relatif cepat untuk operasi penambahan, penghapusan, dan pengecekan keanggotaan.
//  manfaat : Menyediakan koleksi elemen tanpa duplikasi.
//            Ideal digunakan ketika kita perlu menyimpan elemen tanpa memerlukan indeks spesifik.
//            Cocok untuk kebutuhan di mana kecepatan operasi penambahan dan penghapusan lebih penting daripada akses elemen berdasarkan indeks.

// kegunaan dan manfaat Iterator
//  kegunaan : Digunakan untuk melakukan iterasi (perulangan) melalui elemen-elemen koleksi, seperti Set.
// manfaat   : Memisahkan antarmuka eksternal dengan implementasi internal suatu koleksi, sehingga kita tidak perlu tahu bagaimana elemen-elemen disimpan atau diakses di dalam koleksi.
//           : Memungkinkan untuk melakukan iterasi melalui elemen-elemen koleksi dengan cara yang aman dan efisien.
//           : Mendukung operasi seperti hasNext() untuk mengecek apakah ada elemen berikutnya, dan next() untuk mendapatkan elemen berikutnya.
public class SetDicod {

    public static void main(String[] args) {
        // menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("mercury"); // method add() untuk menambahkan objek ke Set
        planets.add("venus");
        planets.add("earth");
        planets.add("earth"); // menambahkan objek "earth" beberapa kali
        planets.add("earth");
        planets.add("mars"); // objek bisa terus ditambahkan ke Set
        planets.add("uranus");
 
        // method size() untuk mendapatkan ukuran Set
        System.out.println("Set planets awal: (size = " + planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t " + planet);
        }
 
        planets.remove("venus"); // method remove() untuk mengeluarkan objek dari Set
 
        System.out.println("Set planets akhir: (size = " + planets.size() + ")");
        Iterator<String> iterator = planets.iterator(); // Perbaikan: menentukan tipe parameter Iterator
        while (iterator.hasNext()) {
            // looping menggunakan Iterator
            System.out.println("\t " + iterator.next());
        }
    }
}
