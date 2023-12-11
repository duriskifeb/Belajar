package Belajar.apalah;

// public class praStrinBu {
//     public static void main(String[] args) {
        
//         // Membuat objek StringBuilder
//         StringBuilder stringBuilder = new StringBuilder();
        
//         // Menambahkan nilai ke objek StringBuilder menggunakan append()
//         stringBuilder.append("Hello");
//         stringBuilder.append(" ");
//         stringBuilder.append("World");
//         stringBuilder.append(" ");
//         stringBuilder.append("Hello");
        
//         // Menampilkan hasilnya
//         System.out.println(stringBuilder.toString()); // Output: Hello World
//     }
// }


// di atas adalah contoh dari methode append.

public class praStrinBu {
    public static void main(String[] args) {
        // Membuat objek StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello World");

        // Menyisipkan nilai pada indeks tertentu
        stringBuilder.insert(5, " Java");

        // Menampilkan hasilnya
        System.out.println(stringBuilder.toString()); // Output: Hello Java World
    }
}

// di atas adalah contoh dari methode insert



  